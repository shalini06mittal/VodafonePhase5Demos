package com.selenium.demos.SeleniumDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AlertDialogBoxTest {
	
	WebDriver driver;
  @Test
  public void testSwitchWithinFrames() throws InterruptedException {

	 driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='proceed']")).click();
	 Thread.sleep(2000);
	 Alert alert =  driver.switchTo().alert();
	 System.out.println(alert.getText());
	 alert.accept();
	 Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  String url="https://www.rediff.com/";
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
