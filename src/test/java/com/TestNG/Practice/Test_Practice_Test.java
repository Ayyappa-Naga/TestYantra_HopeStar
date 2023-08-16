package com.TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.ExcelUtility;
import com.hopestar.GenericUtility.WebDriver_Utility;


public class Test_Practice_Test {
	ExcelUtility eu = new ExcelUtility();
	WebDriver_Utility wu = new WebDriver_Utility();
	WebDriver driver =null;
	@Test
	public void launchApp()throws Throwable
	{
	driver =wu.launchBrowser();
		driver.get("https://demo.actitime.com/login.do");
		wu.maximize(driver);
	}
	@Test(dataProvider =  "readDataForTest",dependsOnMethods = "launchApp")
	public void TestOnly(String path,String value)throws Throwable
	{
		
		driver.findElement(By.xpath(path)).sendKeys(value);
		
		System.out.println(path+""+value);
	}
	@DataProvider
	public Object[][] readDataForTest()throws Throwable
	{
	Object obj[][]=	eu.dataProviding("Sheetanme");
	return obj;
	}

}
