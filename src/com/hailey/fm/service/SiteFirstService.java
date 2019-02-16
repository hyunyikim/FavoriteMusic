package com.hailey.fm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hailey.fm.action.Action;
import com.hailey.fm.action.ActionForward;

public class SiteFirstService implements Action {
	
	String DRIVER_LOC = "C:\\\\Users\\\\Hyunyi\\\\chromedriver_win32\\\\chromedriver.exe";
	String site1_id = "";
	String site1_pwd = "";
	String url = "";
	String myMusicUrl = "";

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		try {
			// 한글 인코딩 설정
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			urlMatching(request); 		//	site1의 url 매칭(melon -> https://www.melon.com ... ) 
			loginCheck(request); 		// 	사용자가 입력한 id, pwd 확인

			forward.setRedirect(false); 
			// forward.setPath("/WEB-INF/views/site_seond.jsp"); 두번째 사이트 접속 확인 후 주석 풀기
			forward.setPath("/WEB-INF/views/playlist_first.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forward;
	}
	
	
	public void urlMatching(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String site1 = (String) session.getAttribute("site1");
		
		if(site1.equals("melon")) {
			url = "https://www.melon.com";
			myMusicUrl = "https://www.melon.com/mymusic/playlist/mymusicplaylist_list.htm?memberKey=29793193";
		}
	}

	public void loginCheck(HttpServletRequest request) {
		// 사용자가 입력한 id, pwd
		site1_id = (String) request.getParameter("site1_id");
		site1_pwd = (String) request.getParameter("site1_pwd");
		
		System.out.println("site1 id : " + site1_id + ", pwd : " + site1_pwd);

		// 크롬 드라이버의 경로를 설정
		System.setProperty("webdriver.chrome.driver", DRIVER_LOC);

		// headless 옵션 설정
		/*
		ChromeOptions chromeOption = new ChromeOptions();
		List<String> options = new ArrayList<String>();
		options.add("headless");
		options.add("window-size=1920x1080");
		options.add("disable-gpu");
		chromeOption.addArguments(options);
		*/

		// 드라이버 실행
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// 로그인
		WebElement memberId = driver.findElement(By.name("memberId"));
		memberId.sendKeys(site1_id);
		WebElement memberPwd = driver.findElement(By.name("memberPwd"));
		memberPwd.sendKeys(site1_pwd);
		WebElement btn_login = driver.findElement(By.className("btn_main_login"));
		btn_login.click();

		
		
		// 마이뮤직으로 이동
		driver.get(myMusicUrl);

		// 마이뮤직 플레이리스트 목록 가져오기
		List<WebElement> albums = driver.findElements(By.className("collection_info72"));
		String[] albumList = new String[albums.size()];
		for (int i = 0; i < albums.size(); i++) {
			albumList[i] = albums.get(i).findElement(By.tagName("dt")).findElement(By.tagName("a")).getText();
			System.out.println("album : " + albumList[i]);
		}
		
		request.setAttribute("albumList", albumList);
		
		//driver.quit();
	}

}
