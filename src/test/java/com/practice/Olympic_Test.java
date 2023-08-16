package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Olympic_Test {
public static void main(String[] args)throws Throwable {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String Country="India";
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	String goldmedals = driver.findElement(By.xpath("(//span[text()='"+Country+"']/preceding-sibling::div/../following-sibling::div[contains(@data-medal-id,'gold-medals-row-')])[1]")).getText();
	String Silvermedals=driver.findElement(By.xpath("(//span[text()='"+Country+"']/preceding-sibling::div/../following-sibling::div[contains(@data-medal-id,'silver-medals-row-')])[1]")).getText();
	String bronzemedals=driver.findElement(By.xpath("(//span[text()='"+Country+"']/preceding-sibling::div/../following-sibling::div[contains(@data-medal-id,'bronze-medals-row-')])[1]")).getText();
	String totalmedals=driver.findElement(By.xpath("(//span[text()='"+Country+"']/preceding-sibling::div/../following-sibling::div[contains(@data-medal-id,'total-medals-row-')])[1]")).getText();
	System.out.println(Country+" "+" No Of gold Medals: "+goldmedals+" Silvermedals: "+Silvermedals+" bronzemedals: "+bronzemedals+" totalmedals : "+totalmedals);
	driver.close();
}
}
