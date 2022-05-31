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

public class BasicLocatorStrategiedTest {
	WebDriver driver;
	String url;
  @Test(enabled = false)
  public void testLocateByid() {
	  WebElement fnameele = driver.findElement(By.id("inputFirstName"));
	  assertEquals(fnameele.getAttribute("placeholder"), "First Name");
	  fnameele.sendKeys("Shalini");
	  driver.findElement(By.id("inputLastName")).sendKeys("Mittal");
	  driver.findElement(By.id("inputEmail")).sendKeys("shalini@gmail.com");
	  driver.findElement(By.id("inputPhone")).sendKeys("1212121212");
	  driver.findElement(By.id("inputAddress1")).sendKeys("Addr 1");
	  driver.findElement(By.id("inputAddress2")).sendKeys("Addr 2");
	  driver.findElement(By.id("inputCity")).sendKeys("Mumbai");
	  driver.findElement(By.id("stateinput")).sendKeys("Mah");
	  driver.findElement(By.id("inputPostcode")).sendKeys("2132321");
	  driver.findElement(By.id("inputCountry")).sendKeys("India");
	  driver.findElement(By.id("customfield2")).sendKeys("2323232323");
	  driver.findElement(By.id("inputNewPassword1")).sendKeys("Cm9K+DJ~vA!X");
	  driver.findElement(By.id("inputNewPassword2")).sendKeys("Cm9K+DJ~vA!X");
	  try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  System.out.println("clicked captch");
	  WebElement registereEle = driver.findElement(By.cssSelector("input[type=submit]"));
	  registereEle.click();
  }
  
  @Test(enabled = false)
  public void testLocateByTagName()
  {
	  List<WebElement> elements = driver.findElements(By.tagName("input"));
	  for(WebElement ele : elements)
	  {
		  System.out.println(ele.getAttribute("name"));
	  }
  }
  
  @Test
  public void testLocateByLinkText()
  {
	  WebElement linkEle = driver.findElement(By.linkText("Announcements"));
	  linkEle.click();
	  assertEquals(driver.getTitle(), "Announcements - PHPTRAVELS");
  }
  @Test
  public void testLocateByPartialLinkText()
  {
	  WebElement linkEle = driver.findElement(By.partialLinkText("Knowledge"));
	  linkEle.click();
	  //assertEquals(driver.getTitle(), "Announcements - PHPTRAVELS");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
	  driver = new ChromeDriver();
	  url="https://phptravels.org/register.php";
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
