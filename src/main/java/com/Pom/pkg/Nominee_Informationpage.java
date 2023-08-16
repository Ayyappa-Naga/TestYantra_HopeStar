package com.Pom.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nominee_Informationpage {
	@FindBy(xpath="//a[.='Add Nominee']")
	private WebElement addNomiee;
	
	@FindBy(xpath="//td[text()='1690262216']/../descendant::a[text()='Client Status']")
	private WebElement Nominee_Clientstatus;

	public WebElement getAddNomiee() {
		return addNomiee;
	}

	public WebElement getNominee_Clientstatus() {
		return Nominee_Clientstatus;
	}
	
	
	public Nominee_Informationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickAddNominee()
	{
		getAddNomiee().click();
	}

	public void clickNClientStatus()
	{
		getNominee_Clientstatus().click();
	}
	public void clientsStatus(String Cid,WebDriver driver )
	{
		 driver.findElement(By.xpath("//table[@class='table']/descendant::td[text()='"+Cid+"']/../descendant::a[text()='Client Status']")).click();
		    
	}
	
}
