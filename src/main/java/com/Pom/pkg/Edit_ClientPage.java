package com.Pom.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.hopestar.GenericUtility.ExcelUtility;

public class Edit_ClientPage {@FindBy(name="client_password")
private WebElement ClientPassTxt;

@FindBy(name="name")
private WebElement ClientName;

@FindBy(name="sex")
private WebElement ClientGender;

@FindBy(name="birth_date")
private WebElement ClientDOB;

@FindBy(name="marital_status")
private WebElement ClientMStatus;

@FindBy(name="nid")
private WebElement Clientnid;

@FindBy(name="phone")
private WebElement ClientPhone;

@FindBy(name="address")
private WebElement Clientaddress;

@FindBy(name="policy_id")
private WebElement ClientPolicyid;

@FindBy(name="agent_id")
private WebElement Agent_ID;


@FindBy(name="submit")
private WebElement UpdateBtn;

@FindBy(xpath="//a[.='Delete Client']")
private WebElement Delete;

public Edit_ClientPage(WebDriver driver )
{
	PageFactory.initElements(driver, this);
}



public WebElement getClientPassTxt() {
	return ClientPassTxt;
}
public WebElement getClientName() {
	return ClientName;
}
public WebElement getClientGender() {
	return ClientGender;
}
public WebElement getClientDOB() {
	return ClientDOB;
}
public WebElement getClientMStatus() {
	return ClientMStatus;
}
public WebElement getClientnid() {
	return Clientnid;
}
public WebElement getClientPhone() {
	return ClientPhone;
}
public WebElement getClientaddress() {
	return Clientaddress;
}
public WebElement getClientPolicyid() {
	return ClientPolicyid;
}
public WebElement getAgent_ID() {
	return Agent_ID;
}
public WebElement getUpdateBtn() {
	return UpdateBtn;
}
public WebElement getDelete() {
	return Delete;
}



ExcelUtility eu = new ExcelUtility(); 
public void editClientData(WebDriver driver ) throws Throwable
{
 
    String Value=eu.readDataFromExcel("Nominee", 10, 1);
 WebElement ele=  getClientaddress();
 ele.clear();
 ele.sendKeys(Value);
 getUpdateBtn().click();
 
}



}
