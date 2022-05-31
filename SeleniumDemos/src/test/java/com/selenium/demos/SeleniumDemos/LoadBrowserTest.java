package com.selenium.demos.SeleniumDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadBrowserTest {

	public static void main(String[] args) {
		// to set the path for chrome driver
		//System.setProperty("webdriver.chrome.driver", "D://jars/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		String url="https://www.google.com";
		//driver.get(url);
		driver.navigate().to(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		driver.close();
		
	}

}
