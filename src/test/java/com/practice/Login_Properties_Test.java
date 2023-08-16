package com.practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login_Properties_Test {
static int a=10;
	public static void main(String[] args)throws Throwable {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		pro.load(fis);
		String URL = pro.getProperty("url");
		String BROWSER = pro.getProperty("browser");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		WebDriver driver;
		
		a=50;
		if(BROWSER.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
		
			driver=new FirefoxDriver();
					
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
		
			driver=new EdgeDriver();
			
		}
		else {
			
			driver=new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[.='login']")).click();
		
	

	}

}
