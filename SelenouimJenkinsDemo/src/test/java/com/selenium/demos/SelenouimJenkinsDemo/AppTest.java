package com.selenium.demos.SelenouimJenkinsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	String url;
  
  @Test
  public void testSelectDropzdown() throws InterruptedException
  {
	  Select selectmonth  = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
	  List<WebElement> months = selectmonth.getOptions();
	  for(WebElement month: months)
	  {
		  System.out.println(month.getText());
	  }
	  
	  selectmonth.selectByIndex(4);
	  Thread.sleep(3000);
	  
	  selectmonth.selectByValue("07");
	  Thread.sleep(3000);
	  
	  selectmonth.selectByVisibleText("OCT");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver 2");
	  ChromeOptions options = new ChromeOptions();
	 // options.addArguments("--headless", "window-size=1400,1500");
	  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
	  driver = new ChromeDriver(options);
	  url="http://register.rediff.com/register/register.php?FormName=user_details";
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
