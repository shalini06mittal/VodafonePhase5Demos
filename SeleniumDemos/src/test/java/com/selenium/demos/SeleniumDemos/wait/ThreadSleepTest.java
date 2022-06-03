package com.selenium.demos.SeleniumDemos.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepTest {
 
  
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  String url="https://www.google.com/";
	  //driver.get(url);
	  driver.manage().window().maximize();
	  driver.get(url);
	   
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  //driver.close();
	  driver.quit();
  }
  @Test
  public void testGoogleSearch() throws InterruptedException {
	  WebElement searchEle = driver.findElement(By.name("q"));
	  Thread.sleep(3000);
	  searchEle.sendKeys("Selenium-webdriver");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@role='presentation']//li[5]")).click();
  }
}
