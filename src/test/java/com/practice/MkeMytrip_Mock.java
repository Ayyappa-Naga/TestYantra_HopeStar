package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MkeMytrip_Mock {
	public static void main(String[] args) throws Throwable {
		WebElement ele;
		String datedfrompage;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String YearAndMonth="October 2023";
		int Date=25;
		
		
		
		Actions actions = new Actions(driver);
		int xCoordinate = 150; 
		int yCoordinate = 150; 
		actions.moveByOffset(xCoordinate, yCoordinate).click().perform();
		Thread.sleep(3000);
		actions.moveByOffset(xCoordinate, yCoordinate).click().perform();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		String actdate="//div[text()='"+YearAndMonth+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+Date+"']";
		for(;;)
		{ 
			try {
	 ele= 	driver.findElement(By.xpath(actdate));
  datedfrompage =ele.getText();
 ele.click();
	 break;
		}
		catch (Exception e) {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		}
		Thread.sleep(3000);
		driver.quit();
		System.out.println( datedfrompage+" "+YearAndMonth);
	}

}
