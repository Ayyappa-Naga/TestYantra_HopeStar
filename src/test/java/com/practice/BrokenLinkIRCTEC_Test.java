package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLinkIRCTEC_Test {

	public static void main(String[] args) throws Throwable {
		int count=0;
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  List<WebElement> link = driver.findElements(By.xpath("//a"));
	  ArrayList<String> flinks= new ArrayList<String>();
	  int noOfLinks=link.size();
	  System.out.println(noOfLinks);
	  
	  for(int i=0;i<link.size();i++)
	  {
		  String eachLink = link.get(i).getAttribute("href");
		  URL url = null;
		  int statusCode=0;
		  try {
		  url = new URL(eachLink);
		  HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
		  statusCode= httpurl.getResponseCode();
		  if(statusCode>=400) {
			  flinks.add(eachLink+"---->"+statusCode);
			  count++;
		  }
		  
		  
	  }
	  catch (Exception e) {
		  flinks.add(eachLink+"---->"+statusCode);
	  }
	}
	  System.out.println(flinks);
	  System.out.println(count);
	  driver.close();
	}

}
