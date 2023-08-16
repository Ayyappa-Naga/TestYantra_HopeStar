package com.practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class ExecuteFromCMD {
	@Test
	public void execuete() throws Throwable {

		String url = System.getProperty("url");

		String Uname = System.getProperty("u_name");
		String Pass= System.getProperty("pass");
	

WebDriver driver = new ChromeDriver();
driver.get(url);
System.out.println(url+Uname+Pass);


	
	
	
	}

}
