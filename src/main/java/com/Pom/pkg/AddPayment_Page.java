package com.Pom.pkg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hopestar.GenericUtility.ExcelUtility;

public class AddPayment_Page  {
	
	
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
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitBtn;
	
	@FindBy(xpath="//td[text()='555']")
	private WebElement AgentID;
	
	
	
	
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
		return SubmitBtn;
	}
	
	public WebElement getAgentID()
	{
		return AgentID;
	}
	
	public AddPayment_Page(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	public void clickSubmit()
	{
		getSubmitBtn().click();
	}

	ExcelUtility eu = new ExcelUtility();
	 ArrayList<String> al = new ArrayList<>();
	 String client__id =null;
	public String addPaymentt(String SheetName,int colNum) throws Throwable 
	{
		for(int i=1;i<=eu.lastRow(SheetName);i++)
		{
			al.add(eu.readDataFromExcel(SheetName, i, colNum));
			
		}
		client__id=al.get(0);
		getClientID().sendKeys(al.get(0));
		getPaymonth().sendKeys(al.get(1));
		getPayamount().sendKeys(al.get(2));
		getPaydue().sendKeys(al.get(3));
		getPayfine().sendKeys(al.get(4));
		clickSubmit();
		return client__id;
		
	
	}
	public void ClientStatus(WebDriver driver ,String cid )
	{
	driver.findElement(By.xpath("//td[text()='"+cid+"']/../descendant::a[text()='Client Status']")).click();
	}
	
	public String getAgentid()
	{
		String a_id = getAgentID().getText();
		return a_id;
	}
}
