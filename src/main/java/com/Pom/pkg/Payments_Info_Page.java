package com.Pom.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payments_Info_Page {
	
	@FindBy(xpath="//a[.='Add Payment']")
	private WebElement AddPayment;
	
	@FindBy(xpath="//td[text()='1690262216']/../descendant::a[text()='Edit']")
	private WebElement EditPayment;

	public WebElement getAddPayment() {
		return AddPayment;
	}

	public WebElement getEditPayment() {
		return EditPayment;
	}
	
	
	public Payments_Info_Page(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddPaymentBtn()
	{
		getAddPayment().click();
	}
	
	public void editPayment()
	{
		getEditPayment().click();
	}
	
	
	
	
}
