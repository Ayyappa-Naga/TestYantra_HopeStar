package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fetch_iccabove_Test {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> match_ele = driver.findElements(By.xpath("//span[@class='u-hide-phablet']/../following-sibling::td[1][number(text()) > 30]"));
		List<WebElement> c_names = driver.findElements(By.xpath("//span[@class='u-hide-phablet']/../following-sibling::td[1][number(text()) > 30]/../descendant::span[@class='u-hide-phablet']"));
		for(int i=0;i<match_ele.size();i++) {
			System.out.println(match_ele.get(i).getText()+" "+c_names.get(i).getText());}
	}

}
