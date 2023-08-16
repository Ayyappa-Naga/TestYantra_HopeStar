package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BrokenLink_KALandRecord_Test {

@Test
	public static void method99() throws Throwable {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://landrecords.karnataka.gov.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  List<WebElement> ele = driver.findElements(By.tagName("a"));
	  ArrayList<String> al = new ArrayList<String>();
	  Actions act = new Actions(driver);

	  Iterator<WebElement> i1 = ele.iterator();
int StatusCode=0;
String eachlink=null;
URL url=null;
while(i1.hasNext())
{
	try {
		eachlink=   i1.next().getAttribute("href");
		url=new URL(eachlink);
		HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
	StatusCode=	httpcon.getResponseCode();
	if(StatusCode>=400)
	{
		al.add(eachlink+" "+StatusCode);
	}	
	}catch (Exception e) {
		al.add(eachlink+" "+StatusCode);
	}
}

System.out.println(al);

}

}



