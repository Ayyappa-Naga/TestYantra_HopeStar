package com.TestNG.Practice;

import org.testng.annotations.Test;

public class Test_Test_Practice {
	@Test(priority = 1)
	public void Vehicle()
	{
		System.out.println("You were Borned");
	}
	@Test(priority = 2 ,dependsOnMethods = "v2")
	public void v1()
	{
		System.out.println("--v1 Execute--");
	}
	
	@Test(priority = 3,invocationCount = 0)
	public void v2()
	{ 
		System.out.println("--v2 Execute--");
	}
}
