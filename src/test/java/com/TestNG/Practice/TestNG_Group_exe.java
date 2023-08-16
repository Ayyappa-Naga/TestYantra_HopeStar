package com.TestNG.Practice;

import org.testng.annotations.Test;

import com.hopestar.GenericUtility.BaseClass;

public class TestNG_Group_exe extends BaseClass {
	@Test
	public void method1()
	{
		System.out.println("Test11");
	}
	
	@Test(groups = { "Regression","Smoke"},dependsOnMethods = "method1")
	public void method2()
	{
		System.out.println("Test22");
	}

}
