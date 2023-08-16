package com.TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.ExcelUtility;
import com.hopestar.GenericUtility.WebDriver_Utility;

public class ChatTestNg_Pract {
    ExcelUtility eu = new ExcelUtility();
    WebDriver_Utility wu = new WebDriver_Utility();
    WebDriver driver = null;

    @Test(dataProvider = "readDataForTest")
    public void launchApp(String path, String value) throws Throwable {
        driver = wu.launchBrowser();
        driver.get("https://demo.actitime.com/login.do");
        wu.maximize(driver);
        driver.findElement(By.xpath(path)).sendKeys(value);
    }

    @Test(dataProvider = "readDataForTest", dependsOnMethods = "launchApp")
    public void TestOnly(String path, String value) throws Throwable {
      
      
    }
    @Test(dependsOnMethods = "TestOnly")
    public void login()
    {
    	driver.findElement(By.xpath("//div[.='Login ']")).click();
    }

    @DataProvider
    public Object[][] readDataForTest() throws Throwable {
        Object[][] obj = eu.dataProviding("Sheetanme"); // Replace "Sheetname" with the actual sheet name in your Excel file
        return obj;
    }
}
