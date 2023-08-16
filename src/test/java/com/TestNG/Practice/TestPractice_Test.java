package com.TestNG.Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.BaseClass;
@Listeners(com.hopestar.GenericUtility.IListenImpClass.class)
public class TestPractice_Test extends BaseClass  {
	
	@Test
	public void testingOnly()
	{
		System.out.println("hello");
	Assert.fail();
		System.out.println("Test Executed ");
		
	}
	

	@Test
	public void testingmethod()
	{
		System.out.println("hi");
		System.out.println("Ayyappa Naga ");
		
	}
	

}
