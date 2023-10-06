package com.practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RedBus_Test {

	public static void main(String[] args)throws Throwable {
		String Month="Oct";
		String Year="2023";
		String Date="26";

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Object la = driver.findElement(By.xpath("//div[@class='labelCalendarContainer']"));
		for(;;)
			try {
		driver.findElement(By.xpath("//div[text()='"+Month+"' and text()='"+Year+"']/ancestor::div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/descendant::span[text()='"+Date+"']")).click();
			break;}
		catch (Exception e) {
			driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			
		}
				//div[21]/descendant::td[text()='July, 2023']/ancestor::div[@class='calendar']/descendant::td[text()='26']	
		
	Thread.sleep(5000);
driver.close();
	}

}
