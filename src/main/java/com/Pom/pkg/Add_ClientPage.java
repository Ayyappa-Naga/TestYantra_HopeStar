package com.Pom.pkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hopestar.GenericUtility.ExcelUtility;

public class Add_ClientPage {
	String cname=null;
	@FindBy(name="client_password")
	private WebElement clientPassTx;
	
	@FindBy(name="name")
	private WebElement ClientName;
	
	@FindBy(name="sex")
	private WebElement ClientGender;
	
	@FindBy(name="birth_date")
	private WebElement ClientDOB;
	
	@FindBy(name="maritial_status")
	private WebElement ClientMStatus;
	
	@FindBy(name="nid")
	private WebElement Clientnid;
	
	@FindBy(name="phone")
	private WebElement ClientPhone;
	
	@FindBy(name="address")
	private WebElement Clientaddress;
	
	@FindBy(name="policy_id")
	private WebElement ClientPolicyid;
	
	@FindBy(name="nominee_name")
	private WebElement Nominee_Name;
	
	@FindBy(name="nominee_birth_date")
	private WebElement NomineeDOB;
	
	@FindBy(name="nominee_sex")
	private WebElement NomineeGender;
	
	@FindBy(name="nominee_nid")
	private WebElement Nomineenid;
	
	@FindBy(name="nominee_relationship")
	private WebElement Nomineerelation;
	
	@FindBy(name="priority")
	private WebElement NPriority;
	
	@FindBy(name="nominee_phone")
	private WebElement NomineePhone;
	
	@FindBy(name="fileToUpload")
	private WebElement FileUpload;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitBtn;

	public WebElement getClientPassTx() {
		return clientPassTx;
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

	public WebElement getNominee_Name() {
		return Nominee_Name;
	}

	public WebElement getNomineeDOB() {
		return NomineeDOB;
	}

	public WebElement getNomineeGender() {
		return NomineeGender;
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

	public WebElement getFileUpload() {
		return FileUpload;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	public Add_ClientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cickSubmit() {
	   getSubmitBtn().click();
	}
	
	 ArrayList<String> a2 = new ArrayList<>();
	 ExcelUtility el = new ExcelUtility();
	public String addClient(String SheetName,int colNum)throws Throwable
	{
	
				for(int i=1;i<=el.lastRow(SheetName);i++)
				{
					a2.add(el.readDataFromExcel(SheetName, i, colNum));	
				}
				cname=a2.get(1);
		getClientPassTx().sendKeys(a2.get(0));
		getClientName().sendKeys(a2.get(1));
		getFileUpload().sendKeys(a2.get(2));
		getClientGender().sendKeys(a2.get(3));
		getClientDOB().sendKeys(a2.get(4));
		getClientMStatus().sendKeys(a2.get(5));
		getClientnid().sendKeys(a2.get(6));
		getClientPhone().sendKeys(a2.get(7));
		getClientaddress().sendKeys(a2.get(8));
		getClientPolicyid().sendKeys(a2.get(9));
		getNominee_Name().sendKeys(a2.get(10));
		getNomineeGender().sendKeys(a2.get(11));
		getNomineeDOB().sendKeys(a2.get(12));
		getNomineenid().sendKeys(a2.get(13));
		getNomineerelation().sendKeys(a2.get(14));
		getNPriority().sendKeys(a2.get(15));
		getNomineePhone().sendKeys(a2.get(16));
		cickSubmit();
		return cname;
	}
	
	
	

}
