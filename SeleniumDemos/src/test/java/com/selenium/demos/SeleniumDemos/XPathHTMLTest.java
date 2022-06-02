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

public class XPathHTMLTest {
	WebDriver driver;
	String url;
  
  @Test
  public void testLocateCheckBoxViaText()
  {
	  // //tr/td[text()='QTP']/preceding-sibling::td/input
	  WebElement linkEle = driver.findElement(By.xpath("//td[text()='QTP']/..//input"));
	  linkEle.click();
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  url="file:///Users/Shalini/Desktop/VodafonePhase5Demos/SeleniumDemos/XPath.html";
	  driver.get(url);
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  //driver.close();
	  driver.quit();
  }

}
