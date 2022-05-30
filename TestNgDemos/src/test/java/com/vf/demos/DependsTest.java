package com.vf.demos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsTest {
  @Test(dependsOnMethods = {"m2"}, alwaysRun = true)
  public void m1() {
	 
		
	  System.out.println("m1");
	  assertEquals(true, true);
	 
		  

  }
  
  @Test
  public void m2() {
	  System.out.println("m2");
	  assertEquals(true, false);
  }
}
