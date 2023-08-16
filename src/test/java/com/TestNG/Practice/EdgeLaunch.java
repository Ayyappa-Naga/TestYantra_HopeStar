package com.TestNG.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class EdgeLaunch {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	WebDriver driver1  = new ChromeDriver();
	WebDriver driver2 = new EdgeDriver();
}
}
