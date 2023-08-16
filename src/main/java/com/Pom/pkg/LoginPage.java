package com.Pom.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	private WebElement UsernameEdt;
	
	@FindBy(name="password")
	private WebElement PasswordEdt;

	@FindBy(xpath="//button[.='login']")
	private WebElement LoginBtn;

	public WebElement getUsernameEdt() {
		return UsernameEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void loginPage(String USERNAME,String PASSWORD) {
		getUsernameEdt().sendKeys(USERNAME);
		getPasswordEdt().sendKeys(PASSWORD);
		getLoginBtn().click();
	}

	
	
}
