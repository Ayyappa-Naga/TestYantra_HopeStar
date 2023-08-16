package com.practice;

import org.openqa.selenium.WebDriver;

import com.hopestar.GenericUtility.WebDriver_Utility;

public class LaunchTest {
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver_Utility wu = new WebDriver_Utility();
		
	WebDriver driver =	wu.launchBrowser();
		
		driver.get("https://www.google.com");
wu.maximize(driver);
System.out.println("hello");
	}

}
