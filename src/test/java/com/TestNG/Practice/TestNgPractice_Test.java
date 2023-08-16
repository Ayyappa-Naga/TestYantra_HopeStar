package com.TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.WebDriver_Utility;
@Test
public class TestNgPractice_Test {
WebDriver_Utility w= new WebDriver_Utility();
	public void testRun() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://claspo.io/");
		w.implicitwait(driver);
		try {
			
		WebElement ele =	driver.findElement(By.xpath("//div[@class='cl-dialog-close-icon']"));
		w.waitForElementVisiblity(driver, ele);
		System.out.println(" x mark found");
		Thread.sleep(10000);
		ele.click();
		System.out.println("element clicked");}
		catch (Exception e) {
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[.='Start for Free']")).click();
			System.out.println("clicked On start free");
		}
	}
	public void testRun2()
	
		{
			System.out.println("t2 executed ");
		}

}
