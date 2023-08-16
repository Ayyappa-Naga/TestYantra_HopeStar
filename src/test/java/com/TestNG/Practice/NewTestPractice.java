package com.TestNG.Practice;

import org.testng.annotations.Test;

import com.hopestar.GenericUtility.BaseClass;

public class NewTestPractice extends BaseClass {
	@Test
	public void methodForTestNG()
	{
		System.out.println("hello");
	}
	
	@Test (groups = "Regression")
	public void methodForTestNG2()
	{
		System.out.println("test2");
	}

}
