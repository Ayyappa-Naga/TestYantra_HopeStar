package com.Pom.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Payment_Page {
	@FindBy(name="client_id")
	private WebElement ClientID;
	@FindBy(name="month")
	private WebElement Paymonth;
	@FindBy(name="amount")
	private WebElement Payamount;
	@FindBy(name="due")
	private WebElement paydue;
	@FindBy(name="fine")
	private WebElement payfine;
	@FindBy(xpath="//a[.='Delete Payment']")
	private WebElement deleBtn;
	
	@FindBy(xpath="//input[type='submit']")
	private WebElement UpdateBtn;
	
	
	
	
	public WebElement getDeleBtn() {
		return deleBtn;
	}
	public WebElement getClientID() {
		return ClientID;
	}
	public WebElement getPaymonth() {
		return Paymonth;
	}
	public WebElement getPayamount() {
		return Payamount;
	}
	public WebElement getPaydue() {
		return paydue;
	}
	public WebElement getPayfine() {
		return payfine;
	}
	public WebElement getSubmitBtn() {
		return UpdateBtn;
	}
	public Edit_Payment_Page(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	public void clickSubmit()
	{
		getSubmitBtn().click();
	}
	public void clickDelete()
	{
		getDeleBtn
		().click();
	}


}
