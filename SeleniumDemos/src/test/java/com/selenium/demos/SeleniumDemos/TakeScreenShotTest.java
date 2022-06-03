package com.selenium.demos.SeleniumDemos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenShotTest {

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
		driver = new ChromeDriver();
		String url="http://demo.guru99.com/V4/";
		//driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(url);

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}
	@Test
	public void testTakeScreenShot() throws Exception {
		takeSnapShot(driver, "test.png") ; 

	}
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{ 
		//Convert web driver object to TakeScreenshot 
		TakesScreenshot scrShot =((TakesScreenshot)webdriver); 
		//Call getScreenshotAs method to create image file 
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); 
		//Move image file to new destination 
		File DestFile=new File(fileWithPath); 
		//Copy file at destination 
		FileUtils.copyFile(SrcFile, DestFile); 
	} 

}
