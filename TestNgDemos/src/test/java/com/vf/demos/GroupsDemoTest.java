package com.vf.demos;

import org.testng.annotations.Test;

public class GroupsDemoTest {
  @Test(groups = {"dev"})
  public void m1() {
	  System.out.println("m1 group dev");
  }
  @Test(groups = {"dev","prod"})
  public void m2() {
	  System.out.println("m2 group dev and prod");
  }
  @Test(groups = {"prod"})
  public void m3() {
	  System.out.println("m3 group prod");
  }
  @Test(groups = {"test"})
  public void m4() {
	  System.out.println("m4 group test");
  }
  
}
