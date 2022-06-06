package com.selenium.demos.SeleniumDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTest {
	
	WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
		  driver = new ChromeDriver();
		  String url="https://jqueryui.com/";
		  //driver.get(url);
		  driver.manage().window().maximize();
		  driver.get(url);
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
		  Thread.sleep(5000);
		  //driver.close();
		  driver.quit();
	  }
  @Test
  public void testDragAndDrop() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
	  driver.switchTo().frame(0);
	  WebElement dragele = driver.findElement(By.id("draggable"));
	  
	  Actions actions = new Actions(driver);
	  actions.dragAndDropBy(dragele, 130, 150).build().perform();
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().parentFrame();
	  
	  driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	  
	  driver.switchTo().frame(0);
	  WebElement dragelesrc = driver.findElement(By.id("draggable"));
	  
	  WebElement droptgtele = driver.findElement(By.id("droppable"));
	  
	 // actions.dragAndDrop(dragelesrc, droptgtele).build().perform();
	  actions
	  .clickAndHold(dragelesrc)
	  .pause(Duration.ofSeconds(2))
	  .moveToElement(droptgtele)
	  .pause(Duration.ofSeconds(2))
	  .release(droptgtele)
	  .build().perform();
  }
}
