package com.Pom.pkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hopestar.GenericUtility.ExcelUtility;

public class AddNominee_Page {
	String Nname=null;
	@FindBy(name="name")
	private WebElement NominneName;
	
	@FindBy(name="sex")
	private WebElement NominneGender;
	
	@FindBy(name="birth_date")
	private WebElement NominneDOB;
	@FindBy(name="nid")
	private WebElement Nomineenid;
	

	@FindBy(name="relationship")
	private WebElement Nomineerelation;
	
	@FindBy(name="priority")
	private WebElement NPriority;
	
	@FindBy(name="phone")
	private WebElement NomineePhone;
	
	@FindBy(name="client_id")
	private WebElement nClient_ID;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Submitbtn;

	public WebElement getNomineeName() {
		return NominneName;
	}

	public WebElement getNomineeGender() {
		return NominneGender;
	}

	public WebElement getNomineeDOB() {
		return NominneDOB;
	}

	public WebElement getNomineenid() {
		return Nomineenid;
	}

	public WebElement getNomineerelation() {
		return Nomineerelation;
	}

	public WebElement getNPriority() {
		return NPriority;
	}

	public WebElement getNomineePhone() {
		return NomineePhone;
	}

	public WebElement getnClient_ID() {
		return nClient_ID;
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
       
	
	public AddNominee_Page(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);	
	}
	
	public void clickSubmit()
	{
		getSubmitbtn().click();
	}
	
	 ArrayList<String> all = new ArrayList<>();
	 ExcelUtility el = new ExcelUtility();
	public String addNominee(String SheetName,int colNum)throws Throwable
	{
		for(int i=10;i<=el.lastRow(SheetName);i++)
		{
			all.add(el.readDataFromExcel(SheetName, i, colNum));	
		}
		Nname=all.get(1);
		getnClient_ID().sendKeys(all.get(0));
		getNomineeName().sendKeys(all.get(1));
		getNomineeGender().sendKeys(all.get(2));
		getNomineeDOB().sendKeys(all.get(3));
		getNomineenid().sendKeys(all.get(4));
		getNomineerelation().sendKeys(all.get(5));
		getNPriority().sendKeys(all.get(6));
		getNomineePhone().sendKeys(all.get(7));
		clickSubmit();
		return Nname;
		
	}
	
	
	
}
