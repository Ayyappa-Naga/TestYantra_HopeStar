package com.practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public abstract class FlipKart_Samsung_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();}
		finally {
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung",Keys.ENTER);
		List<WebElement> Pro_Names = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		List<WebElement> Pro_Prices = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		Iterator<WebElement> it1 = Pro_Names.iterator();
	Iterator<WebElement> it2 = Pro_Prices.iterator();
		while(it1.hasNext()&& it2.hasNext()) {
		System.out.println(it1.next().getText()+"--->"+it2.next().getText());}
			
		}
		
		

		

	}

}
