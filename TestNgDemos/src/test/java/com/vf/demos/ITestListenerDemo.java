package com.vf.demos;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ITestListenerDemo  implements ITestListener{
 
	@Override
	public void onStart(ITestContext context) {
		System.out.println("listener when test starts");
		System.out.println(context.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("listener when test finishes");
		System.out.println(context.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("listener when test succeeds");
		for(Object ob:result.getParameters())
		{
			System.out.println(ob);
		}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("listener when test fails");
	}
}
