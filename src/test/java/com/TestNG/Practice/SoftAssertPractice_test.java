package com.TestNG.Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice_test {

	@Test
	public void softAssert()
	{
		System.out.println("step-1");
		System.out.println("step-2");
		SoftAssert sa = new SoftAssert();
	
	 sa.assertEquals("Hello", "hello");
		System.out.println("step-3");
		int q=10;
		sa.assertNull(q);
		sa.fail();
		System.out.println("step-4");
		sa.assertAll();
	
	}
	
	
	
	

}
