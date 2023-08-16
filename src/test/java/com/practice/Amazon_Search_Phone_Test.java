package com.practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon_Search_Phone_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//li[@aria-label='Samsung']/descendant::i[@class='a-icon a-icon-checkbox']")).click();
		List<WebElement> Names_ = driver.findElements(By.xpath("//span[@class='a-price-whole']/ancestor::div[@class='a-section']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prices_= driver.findElements(By.xpath("//span[@class='a-price-whole']/ancestor::div[@class='a-section']/descendant::span[@class='a-price-whole']"));
		Iterator<WebElement> it = Names_.iterator();
		Iterator<WebElement> it1 = prices_.iterator();
		while(it.hasNext()&& it1.hasNext()) {
			String names=it.next().getText();
			String prices=it1.next().getText();
			System.out.println(names+"-->"+prices);}driver.close();
	
	}

}
