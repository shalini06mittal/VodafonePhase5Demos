package com.vf.demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTest {

	@Test(description = "This test is first test case", priority = 1)
	public void a() {
		System.out.println("test case 1") ;
	}
	@Test(priority = 2 )
	public void x() {
		System.out.println("test case 2") ;
	}
	@Test(priority = 0, enabled = true)
	//@Ignore
	public void w() {
		System.out.println("test case 3") ;
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method") ;
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method") ;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class") ;
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class") ;
	}

}
