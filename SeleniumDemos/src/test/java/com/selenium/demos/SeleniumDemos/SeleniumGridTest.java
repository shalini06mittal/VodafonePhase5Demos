package com.selenium.demos.SeleniumDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	WebDriver driver;
	String baseUrl, nodeUrl;
	
	@BeforeMethod
	public void before() throws MalformedURLException
	{
		baseUrl = "https://www.google.com";
		nodeUrl = "http://localhost:4444";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		
		driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		
	}
	@AfterMethod
	public void after() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
  @Test
  public void testHubNode() {
	  driver.get(baseUrl);
	  
  }
}
