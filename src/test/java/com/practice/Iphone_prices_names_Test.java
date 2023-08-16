package com.practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Iphone_prices_names_Test {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Names_ele = driver.findElements(By.xpath("//span[@class='a-price-whole']/ancestor::div[@class='a-section']/descendant::span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prices_ele= driver.findElements(By.xpath("//span[@class='a-price-whole']/ancestor::div[@class='a-section']/descendant::span[@class='a-price-whole']"));
Iterator<WebElement> it = Names_ele.iterator();
Iterator<WebElement> it1 = prices_ele.iterator();
while(it.hasNext()&& it1.hasNext()) {
	String names=it.next().getText();
	String prices=it1.next().getText();
	System.out.println(names+"-->"+prices);
}
		driver.close();
	}

}
