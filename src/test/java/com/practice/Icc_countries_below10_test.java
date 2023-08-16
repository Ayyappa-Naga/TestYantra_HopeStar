package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Icc_countries_below10_test {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> pos_c_ele = driver.findElements(By.xpath("//tbody//tr/td[1][number(text()) <10]/../descendant::span[@class='u-hide-phablet']"));
		for(int i=0;i<pos_c_ele.size();i++) {
			System.out.println(pos_c_ele.get(i).getText());}}}