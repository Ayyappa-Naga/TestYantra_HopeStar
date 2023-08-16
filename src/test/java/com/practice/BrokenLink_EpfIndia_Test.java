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




public class BrokenLink_EpfIndia_Test  {
@Test
	public static void method1() throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.epfindia.gov.in/site_en/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		System.out.println(Links.size());
		ArrayList<String> linklist= new ArrayList<String>();
		URL url = null;
		int Statuscode =0;
		for(int i=0;i<Links.size();i++) {
			String eachLink = Links.get(i).getAttribute("href");
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
