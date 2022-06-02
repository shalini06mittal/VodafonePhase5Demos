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

public class LocateCSSSelectorTest {
	WebDriver driver;
	String url;
  
  @Test
  public void testLocateByCssSelector() throws InterruptedException
  {
	  WebElement headEle = driver.findElement(By.cssSelector("h2[id^=header]"));
	  System.out.println("Text "+headEle.getText());
	  assertEquals(headEle.getText(),"Application Test Drive");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  url="https://phptravels.com/demo/";
	  //driver.get(url);
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	   
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  //driver.close();
	  driver.quit();
  }

}
