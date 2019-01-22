package com.hailey.fm;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	final static String NAVER_URL = "https://www.naver.com";
	final static String ACCOUNT_ID = "{{ID}}";
	final static String ACCOUNT_PASSWORD = "{{PASSWORD}}";

	public void exampleMethod() throws IOException {
		// 크롬 드라이버의 경로를 설정
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/webdriver/chromedriver");

		// 드라이버 실행
		WebDriver driver = new ChromeDriver();
		driver.get(NAVER_URL);

		// 로그인
		WebElement accountElement = driver.findElement(By.id("account"));
		WebElement idTextBox = accountElement.findElement(By.id("id"));
		idTextBox.sendKeys(ACCOUNT_ID);
		WebElement pwTextBox = accountElement.findElement(By.id("pw"));
		pwTextBox.sendKeys(ACCOUNT_PASSWORD);
		WebElement loginSpan = accountElement.findElement(By.className("btn_login"));
		WebElement loginButton = loginSpan.findElement(By.tagName("input"));
		loginButton.click();

		// 브라우져 등록 페이지
		WebElement registBrowser = driver.findElement(By.id("frmNIDLogin")).findElement(By.className("login_form"))
				.findElement(By.className("btn_upload")).findElement(By.tagName("a"));
		registBrowser.click();
		WebElement loginPersistButton = driver.findElement(By.id("login_maintain"))
				.findElement(By.className("btn_maintain")).findElement(By.tagName("a"));
		loginPersistButton.click();

		// 네이버 미니미
		WebElement minimeElement = driver.findElement(By.id("minime"));
		String minimeURL = minimeElement.getAttribute("src");
		System.out.println(minimeURL);

		// 스크린샷
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
		try (FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/screenshot.png")) {
			fos.write(imageByte);
			fos.close();
		}

		// 드라이버 종료
		driver.quit();

	}
}