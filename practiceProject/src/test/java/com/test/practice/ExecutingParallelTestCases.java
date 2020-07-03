package com.test.practice;

import org.testng.annotations.Test;

public class ExecutingParallelTestCases {

	
	@Test(threadPoolSize = 1, invocationCount = 5, timeOut =1000 )
	public void Test1()
	{
		
		System.out.println("TestCase 1 " + Thread.currentThread().getId());
	
		
	}
	
	@Test
	public void Test2()
	{
		System.out.println("TestCase 2 " + Thread.currentThread().getId());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
