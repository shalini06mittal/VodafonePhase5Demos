package com.selenium.demos.SeleniumDemos.wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitwaitTest {
 
  
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  String url="file:///Users/Shalini/Desktop/VodafonePhase5Demos/SeleniumDemos/waits.html";
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
 // @Test
  public void testAlertPresent() throws InterruptedException {
	  System.out.println("testing...");
	  WebElement searchEle = driver.findElement(By.id("alert"));

	  searchEle.click();

	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	  wait.until(ExpectedConditions.alertIsPresent());
	  driver.switchTo().alert().dismiss();
	 
  }
  
 // @Test
  public void testElementClickable() throws InterruptedException
  {
	  driver.findElement(By.id("display-other-button")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  WebElement ele =	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("hidden"))));
	  ele.click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
  }
  //@Test
  public void testElementSelected()
  {
	  driver.findElement(By.id("checkbox")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.elementToBeSelected(By.id("ch")));
	  
  }
  @Test
  public void testIfTextIspresent()
  {
	  driver.findElement(By.id("populate-text")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2[@class='target-text']")),"Selenium Webdriver"));
  }
  
}
