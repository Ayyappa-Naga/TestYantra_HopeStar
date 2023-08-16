package com.practice;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;



public class Practice_rmgy_Test {

	public static void main(String[] args) throws Exception {
		String proName="HopeStar(LifeInsurance)";
		
		
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://rmgtestingserver:8084/");
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   

   
   
   driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
   driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
   driver.findElement(By.xpath("//button[.='Sign in']")).click();
   
   driver.findElement(By.xpath("//a[.='Projects']")).click();
   
   driver.findElement(By.xpath("//span[.='Create Project']")).click();
   driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(proName);
   driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Ayyappa_Naga");
   driver.findElement(By.xpath("(//select[@name='status'])[2]")).click();
   Robot r = new Robot();
   
   r.keyPress(KeyEvent.VK_DOWN);
   r.keyRelease(KeyEvent.VK_DOWN);
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
   driver.findElement(By.xpath("(//input[@class='btn btn-success'])[1]")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//a[.='Logout']")).click();
   driver.close();
   
   
   
			Driver jD = new Driver();
			DriverManager.registerDriver(jD);
			Connection conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement state = conn.createStatement();
					String Query ="select * from project;";
					ResultSet rs=state.executeQuery(Query);
					boolean flag=false;
					while(rs.next()) {
						rs.getString(4).equalsIgnoreCase(proName);
						flag =true;
						break;
						
						
					}
					if(flag) {
						System.out.println("project created successfully");
					}
					else {
						System.out.println("project not created");
					}
			
	}

}
