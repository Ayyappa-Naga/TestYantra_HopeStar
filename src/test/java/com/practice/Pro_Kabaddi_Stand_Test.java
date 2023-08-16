package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pro_Kabaddi_Stand_Test {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String Team_name="Puneri Paltan";
	String Match_Played=	driver.findElement(By.xpath("//p[text()='"+Team_name+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-play']")).getText();
String Match_won=driver.findElement(By.xpath("//p[text()='"+Team_name+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-won']")).getText();
String Match_Lost=driver.findElement(By.xpath("//p[text()='"+Team_name+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-lost']")).getText();
String Match_draw=driver.findElement(By.xpath("//p[text()='"+Team_name+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data matches-draw']")).getText();
String Score_diff=driver.findElement(By.xpath("//p[text()='"+Team_name+"']/ancestor::div[@class='row-head']/descendant::div[@class='table-data score-diff']")).getText();
System.out.println(Team_name+"-----> matchplayed :"+Match_Played+" match won :"+Match_won+" match lost :"+Match_Lost+" match draw : "+Match_draw+"score diff :"+Score_diff);
}
}