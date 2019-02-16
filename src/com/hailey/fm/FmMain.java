package com.hailey.fm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.hailey.vo.MusicVo;

public class FmMain {
	final static String MELON_URL = "https://www.melon.com";
	final static String MYMUSIC_URL = "https://www.melon.com/mymusic/playlist/mymusicplaylist_list.htm?memberKey=29793193";
	final static String DRIVER_LOC = "C:\\\\Users\\\\Hyunyi\\\\chromedriver_win32\\\\chromedriver.exe";
	final static String ACCOUNT_ID = "id";
	final static String ACCOUNT_PASSWORD = "pwd";
	
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		// 크롬 드라이버의 경로를 설정
		System.setProperty("webdriver.chrome.driver", DRIVER_LOC);
		
		// headless 옵션 설정 
		ChromeOptions chromeOption = new ChromeOptions();
		List<String> options = new ArrayList<String>();
		options.add("headless");
		options.add("window-size=1920x1080");
		options.add("disable-gpu");
		chromeOption.addArguments(options);
		
		// 드라이버 실행
		//WebDriver driver = new ChromeDriver(chromeOption);
		driver = new ChromeDriver();
		// driver.get(MELON_URL);
		
		// 로그인 
		/*
		WebElement memberId = driver.findElement(By.name("memberId"));
		memberId.sendKeys(ACCOUNT_ID);
		WebElement memberPwd = driver.findElement(By.name("memberPwd"));
		memberPwd.sendKeys(ACCOUNT_PASSWORD);
		WebElement btn_login = driver.findElement(By.className("btn_main_login"));
		btn_login.click();
		*/
		
		// 마이뮤직으로 이동
		driver.get(MYMUSIC_URL);
		
		// 마이뮤직 플레이리스트 목록 가져오기 
		List<WebElement> albums = driver.findElements(By.className("collection_info72"));
		String[] albumList = new String[albums.size()];
		for(int i = 0; i < albums.size(); i++) {
			albumList[i] = albums.get(i).findElement(By.tagName("dt")).findElement(By.tagName("a")).getText();
			System.out.println("album : " + albumList[i]);
			String selectedAlbum = "똔띠";
			if(albumList[i].equals(selectedAlbum)) {
				albums.get(i).findElement(By.tagName("dt")).findElement(By.tagName("a")).click();
				break;
			}
		}
		
		ArrayList<MusicVo> musicList = new ArrayList<MusicVo>();
		
		// 처음 한 번 
		
		
		WebElement web_pageNum = driver.findElement(By.className("page_num"));
		List<WebElement> web_pageNumAs = web_pageNum.findElements(By.tagName("a"));
		
		for(WebElement web_pageNumA : web_pageNumAs) {
			web_pageNumA.click();
			
			
		}
		
		
		
		// String album = albums.get(0).findElement(By.tagName("dt")).findElement(By.tagName("a")).getText();
		
		
			
		// driver.quit();
	}
	
	private void addMusicList() {
		List<WebElement> web_musicList = driver.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		ArrayList<MusicVo> musicList = new ArrayList<MusicVo>();
		for(WebElement web_music : web_musicList) {
			MusicVo musicVo = new MusicVo();
			String title = web_music.findElement(By.className("fc_gray")).getText();
			String singer = web_music.findElement(By.id("artistName")).findElement(By.tagName("a")).getText();
			
			musicVo.setTitle(title);
			musicVo.setSinger(singer);
			musicList.add(musicVo);
		}
	}
}