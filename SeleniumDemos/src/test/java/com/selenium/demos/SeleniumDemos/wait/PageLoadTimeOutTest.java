package com.selenium.demos.SeleniumDemos.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageLoadTimeOutTest {

	 WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
		  driver = new ChromeDriver();
		  String url="https://edition.cnn.com/";
		  //driver.get(url);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		  driver.get(url);
		  
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(2000);
		  //driver.close();
		  driver.quit();
	  }
	  @Test
	  public void testPageLoad() throws InterruptedException {
		 
	  }
}
