package com.selenium.demos.SeleniumDemos;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LocateByXpathMethodsTest {
	WebDriver driver;
	String url;
  
	/*
	 * freecrm.com
	 */
	//*[@id="navbar-collapse"]/ul/li[4]/a
	// search with parent reference
	//*[@id="navbar-collapse"]//a[text()='Features']
	
  @Test
  public void testLocateByXPath() throws InterruptedException
  {
	 ////div[@id='globalContainer']//form/div[5]/a
	
	  WebElement ele1 = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	  ele1.click();
	  Thread.sleep(5000);
	  WebElement ele = driver.findElement(By.xpath("//input[contains(@class,'inputtext') and contains(@name,'firstname')]"));
	  ele.sendKeys("Shalini"); 
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  url="https://www.facebook.com//";
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

}
