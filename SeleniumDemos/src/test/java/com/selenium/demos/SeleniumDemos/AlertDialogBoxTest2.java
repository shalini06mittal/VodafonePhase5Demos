package com.selenium.demos.SeleniumDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AlertDialogBoxTest2 {
	
	WebDriver driver;
  @Test
  public void testPromptAndConfirm() throws InterruptedException {

	 driver.findElement(By.id("conf")).click();
	 Thread.sleep(1000);
	
	 Alert alert =  driver.switchTo().alert();
	 System.out.println(alert.getText());
	 
	 alert.dismiss();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.id("prom")).click();
	 Thread.sleep(1000);
	
	 Alert alert1 =  driver.switchTo().alert();
	 System.out.println(alert1.getText());
	 alert1.sendKeys("Shalini");
	 alert1.accept();
	 Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  String url="file:///Users/Shalini/Desktop/VodafonePhase5Demos/SeleniumDemos/dialog.html";
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
