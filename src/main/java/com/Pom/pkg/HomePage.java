package com.Pom.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//input[@name='key']")
	private WebElement SearchBox;
	
	
	@FindBy(xpath="//a[.='CLIENTS']")
	private WebElement ClientModule;
	
	
	@FindBy(xpath="//a[.='NOMINEE']")
	private WebElement NomineeModule;
    
	@FindBy(xpath="//a[text()='PAYMENTS']")
	private WebElement PaymentsModule;
	
	@FindBy(xpath="//a[text()='POLICY']")
	private WebElement PolicyModule;
	
	@FindBy(xpath="//a[text()='AGENTS']")
	private WebElement AgentsModule;
	
	@FindBy(className ="searchBtn")
	private WebElement SearchBtn;
	
	@FindBy(xpath="//a[.='Aegon Life']")
	private WebElement HomeBtn;
	
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement LogOutBtn;

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getClientModule() {
		return ClientModule;
	}

	public WebElement getNomineeModule() {
		return NomineeModule;
	}

	public WebElement getPaymentsModule() {
		return PaymentsModule;
	}

	public WebElement getPolicyModule() {
		return PolicyModule;
	}

	public WebElement getAgentsModule() {
		return AgentsModule;
	}

	public WebElement getSearchBtn() {
		return SearchBtn;
	}

	public WebElement getHomeBtn() {
		return HomeBtn;
	}

	public WebElement getLogOutBtn() {
		return LogOutBtn;
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickClients() {
		getClientModule().click();
	}
	
	public void clickPayments() {
		getPaymentsModule().click();
	}
	
	public void clickAgents() {
		getAgentsModule().click();
	}
	
	public void clickPolicy() {
		getPolicyModule().click();
	}
	public void clickNominee() {
		getNomineeModule().click();
	}
	
	
	public void search(String value)
	{
		getSearchBox().sendKeys(value);
		getSearchBtn().click();
	}
	
	public void logout()
	{
		getLogOutBtn().click();
	}
	
	
	
	
	
	
	
	
	
	

}
