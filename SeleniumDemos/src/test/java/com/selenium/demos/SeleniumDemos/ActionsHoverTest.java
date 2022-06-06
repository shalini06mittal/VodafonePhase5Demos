package com.selenium.demos.SeleniumDemos;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsHoverTest {
	WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
		  driver = new ChromeDriver();
		  String url="https://www.americangolf.eu/";
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
  public void testClickOnTrousersLink() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"termly-code-snippet-support\"]/div/div/div/div/div/div[2]/div[2]/button")).click();
	 WebElement eleLink = driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[4]/a"));
	 Actions action = new Actions(driver);
	 action.moveToElement(eleLink).build().perform();
	driver.findElement(By.xpath("//*[@id='CLOTHFOOTW_1']/ul/li[3]/ul/li[1]/a/span")).click();
	assertEquals(driver.getTitle(), "Golf Trousers · American Golf");

  }
}
