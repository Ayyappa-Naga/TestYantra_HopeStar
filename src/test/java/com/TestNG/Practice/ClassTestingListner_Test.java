package com.TestNG.Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.BaseClass;

@Listeners(com.hopestar.GenericUtility.IListenImpClass.class)
public class ClassTestingListner_Test extends BaseClass{
	@Test
	public void method()
	{
		Assert.fail();
	}

}
