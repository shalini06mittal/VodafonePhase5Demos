package com.selenium.demos.SeleniumDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FrameDemoTest {
	
	WebDriver driver;
  @Test
  public void testSwitchWithinFrames() {
	  driver.switchTo().frame("classFrame");
	 driver.findElement(By.linkText("Deprecated")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  String url="https://docs.oracle.com/javase/7/docs/api/";
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
