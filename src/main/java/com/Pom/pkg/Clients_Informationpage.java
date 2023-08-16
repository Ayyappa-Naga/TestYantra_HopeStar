package com.Pom.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Clients_Informationpage {String cid=null;

	@FindBy(xpath="//td[text()='1690262216']/../descendant::a[text()='Client Status']")
	private WebElement Clientstatus;
	
	@FindBy(xpath="//td[text()='1690262216']/../descendant::a[text()='Edit']")
	private WebElement EditClient;
	
	@FindBy(xpath = "//a[.='Add Client']")
	private WebElement AddClient;
	@FindBy(xpath = "//div[@id='page-wrapper']")
	private WebElement ClientData;

	public String getCid() {
		return cid;
	}

	public WebElement getClientstatus() {
		return Clientstatus;
	}

	
	public WebElement getClientData() {
		return ClientData;
	}

	public WebElement getEditClient() {
		return EditClient;
	}

	public WebElement getAddClient() {
		return AddClient;
	}
	
	
	public Clients_Informationpage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	
	public void clickAddClient() {
		getAddClient().click();
	}
	public void clickClientStatus()
	{
		getClientstatus().click();
	}
	public void clickEdit()
	{
		getEditClient().click();
	}
	
	public void clickOnCs(String Cid,WebDriver driver ) throws Throwable
	{
		 
		    driver.findElement(By.xpath("//td[text()='"+Cid+"']/../descendant::a[text()='Client Status']")).click();
	}
	
}
