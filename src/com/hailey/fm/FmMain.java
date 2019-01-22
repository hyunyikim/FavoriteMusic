package com.hailey.fm;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FmMain {
	final static String NAVER_URL = "https://www.melon.com";
	final static String MYMUSIC_URL = "https://www.melon.com/mymusic/playlist/mymusicplaylist_list.htm?memberKey=29793193";
	final static String DRIVER_LOC = "C:\\\\Users\\\\Hyunyi\\\\chromedriver_win32\\\\chromedriver.exe";
	final static String ACCOUNT_ID = "id";
	final static String ACCOUNT_PASSWORD = "password";
	
	
	public static void main(String[] args) throws IOException {
		
		// 크롬 드라이버의 경로를 설정
		System.setProperty("webdriver.chrome.driver", DRIVER_LOC);

		// 드라이버 실행
		WebDriver driver = new ChromeDriver();
		driver.get(NAVER_URL);
		
		// 로그인 
		WebElement memberId = driver.findElement(By.name("memberId"));
		memberId.sendKeys(ACCOUNT_ID);
		WebElement memberPwd = driver.findElement(By.name("memberPwd"));
		memberPwd.sendKeys(ACCOUNT_PASSWORD);
		
		WebElement btn_login = driver.findElement(By.className("btn_main_login"));
		btn_login.click();
		
		// 마이뮤직으로 이동
		driver.get(MYMUSIC_URL);
		
		// 플레이리스트 목록 가져오기 
		List<WebElement> albums = driver.findElements(By.className("collection_info72"));
		String[] albumList = new String[albums.size()];
		for(int i = 0; i < albums.size(); i++) {
			albumList[i] = albums.get(i).findElement(By.tagName("dt")).findElement(By.tagName("a")).getText();
			// System.out.println("album : " + albumList[i]);
		}
		
		
	}
}