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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SelectDropDownTest {
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
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
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
