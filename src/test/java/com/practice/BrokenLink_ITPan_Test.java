package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class BrokenLink_ITPan_Test {

@Test
		public static void method3() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://incometaxindia.gov.in/Pages/tax-services/apply-for-pan.aspx");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
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
