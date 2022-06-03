package com.selenium.demos.SeleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableTest {
	 WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "/Users/Shalini/Desktop/VodafonePhase5Demos/chromedriver 2");
		  driver = new ChromeDriver();
		  String url="https://demo.guru99.com/test/web-table-element.php";
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
  public void testTableValuesForCompanynames() {
	  List<WebElement> heading = driver.findElements(By.xpath("//table[@class='dataTable']//thead//th"));
	  for(WebElement head:heading)
	  {
		  System.out.print(head.getText()+"\t");
	  }
	  System.out.println();
	  
	  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
	  System.out.println(rows.size());
	  for(int i=0;i<rows.size();i++)
	  {
		  WebElement row = rows.get(i);
		  
		  // this prints details of first column
//		  WebElement companyEle = row.findElement(By.tagName("td"));
//		  System.out.println(companyEle.getText());
		  
		  List<WebElement> columns = row.findElements(By.tagName("td"));
		  for(WebElement col : columns)
			  System.out.print(col.getText()+"\t");
		  System.out.println();
		  
	  }
  }
}
