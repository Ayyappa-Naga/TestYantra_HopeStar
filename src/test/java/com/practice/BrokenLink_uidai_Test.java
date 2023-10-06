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
import org.testng.annotations.Test;



public class BrokenLink_uidai_Test {
@Test
	public static void method98() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uidai.gov.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		String s=AllLinks.getClass().getName();
		System.out.println(s);
		System.out.println(AllLinks.size());
		ArrayList<String> linklist= new ArrayList<String>();
		URL url = null;
		int Statuscode =0;
		for(int i=0;i<AllLinks.size();i++) {
			String eachLink = AllLinks.get(i).getAttribute("href");
			try {
			
			url= new URL(eachLink);
			HttpURLConnection httpconn = (HttpURLConnection) url.openConnection();
			Statuscode=httpconn.getResponseCode();
			if(Statuscode>=400) {
				linklist.add(eachLink+"--->"+Statuscode);
			}
			}
			catch(Exception e){
				linklist.add(eachLink+"--->"+Statuscode);
			}
			
		}
		
		System.out.println(linklist);

	}

}
