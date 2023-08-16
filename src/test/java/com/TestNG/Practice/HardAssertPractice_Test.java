package com.TestNG.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPractice_Test {
	@Test
public void hardMethod()
{
	System.out.println("step-1");
	System.out.println("step-2");
	int q=10;
	Assert.assertNotNull(q);
 Assert.assertEquals("hello", "hello");
	System.out.println("step-3");
	Assert.fail();
	System.out.println("step-4");
	
	
}

}
