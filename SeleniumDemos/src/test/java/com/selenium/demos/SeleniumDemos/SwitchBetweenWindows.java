package com.selenium.demos.SeleniumDemos;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchBetweenWindows {
	WebDriver driver;
  @Test
  public void testSwitchWindow() throws InterruptedException {
	  // Go to techgatha.com
	  // click on kids section
	  // search for the link for Areeb and click it. It opens the page on a new tab
	  driver.findElement(By.partialLinkText("KIDS")).click();
	  driver.findElement(By.cssSelector("a[href^=\"areeb\"]")).click();
	  
	  String mainwind = driver.getWindowHandle();
	  
	  Set<String> childwindows = driver.getWindowHandles();
	  Iterator<String> it = childwindows.iterator();
	  while (it.hasNext())
	  {
		  String window = it.next();
		  if(! window.equals(mainwind)) {
			  driver.switchTo().window(window);
			  assertEquals(driver.getCurrentUrl(),"https://www.techgatha.com/areeb/games.html"); 	
		  }
	  }
	 // to get the handle back to the main window and click on VIDEO link	
	  Thread.sleep(1000);
	  driver.switchTo().window(mainwind);
	  Thread.sleep(1000);
	  driver.findElement(By.partialLinkText("VIDEOS")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  String url="https://www.techgatha.com/";
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
