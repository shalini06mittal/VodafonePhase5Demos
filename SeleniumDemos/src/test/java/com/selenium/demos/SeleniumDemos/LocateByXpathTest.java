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

public class LocateByXpathTest {
	WebDriver driver;
	String url;
  
 // @Test
  public void testLocateByXPath() throws InterruptedException
  {
	 
	
	  //WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	  WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
	  ele.sendKeys("Selenium"); 
  }
  //@Test
  public void testLocateByXPathText() throws InterruptedException
  {
	  WebElement ele = driver.findElement(By.xpath("//a[text()='Gmail']"));
	  ele.click();
	  
	  ////div[contains(text(),'Google offered ')]
	 
  }
  @Test
  public void testLocateByXPathTextAndContains() throws InterruptedException
  {
	  WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Google offered ')]"));
	  assertEquals(ele.getText(), "Google offered in:  ");
	  
	  ////div[contains(text(),'Google offered ')]
	 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  url="https://www.google.com/";
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
