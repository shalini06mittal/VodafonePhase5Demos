package com.vf.demos;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ITestListenerDemo.class)
public class ParametersTest {
  @Test
  @Parameters({"uname","pwd"})
  public void testLoginScreen(String uname, String pwd) {
	  System.out.println(uname+" "+pwd);
	  Reporter.log("test starting....");
	  assertEquals("shalini", uname);
	  assertEquals("1234", pwd);
	  Reporter.log("test finished");
	  
  }
  
  @Test(dataProvider = "userDetails")
  public void testLoginScreenFromDataProvider(String uname, String pwd) {
	  System.out.println(uname+" "+pwd);
	  assertEquals("shalini", uname);
	  assertEquals("1234", pwd);
  }
  
  
  @DataProvider
  public Object[][] userDetails()
  {
	  return new Object[][] {
		  {"shalini","1234"},
		  {"shalini","12345"},
	  };
  }
}
