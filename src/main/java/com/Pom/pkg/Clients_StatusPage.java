package com.Pom.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clients_StatusPage {
	@FindBy(xpath="//a[.='Edit Client']")
	private WebElement EditClient; 

	@FindBy(xpath="//a[.='Add Nominee']")
	private WebElement AddNominee;
	
	@FindBy(xpath="//a[.='Edit']")
	private WebElement EditNominee;
	
	@FindBy(xpath="//a[.='Delete Client']")
	private WebElement DeleteClient;

	public WebElement getEditClient() {
		return EditClient;
	}

	public WebElement getAddNominee() {
		return AddNominee;
	}

	public WebElement getEditNominee() {
		return EditNominee;
	}

	public WebElement getDeleteClient() {
		return DeleteClient;
	}
	
	public Clients_StatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickEditClient() {
		getEditClient().click();
	}
	
	
	public void clickAddNominee() {
		getAddNominee().click();
	}
	
	public void clickEditNominee() {
		getEditNominee().click();
	}
	
	public void clickDeleteClient()
	{
		getDeleteClient().click();
	}
}
