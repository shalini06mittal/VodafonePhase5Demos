package com.vf.demos;

import org.testng.annotations.Test;

public class MyTestClass1 extends AbstractClassTest {
	@Test
	public void m1() {
		
		System.out.println("m1 in test class 1");
		
	}
	@Test
	public void m2() {
		System.out.println("m2 in test class 1");
	}
}
