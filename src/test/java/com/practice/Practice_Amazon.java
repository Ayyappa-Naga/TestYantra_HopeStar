package com.practice;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Practice_Amazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	Iterator<WebElement> i1 = ele.iterator();
	while(i1.hasNext()) {
		try {
		String s1=i1.next().getText();
		s1=s1.replace(",","");
		Integer n= Integer.valueOf(s1);
		if(n<70000)
		System.out.println(n);}
		catch (Exception e){
			
		}
	}

	}

}
