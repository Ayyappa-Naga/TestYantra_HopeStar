package com.hopestar.Payment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pom.pkg.AddPayment_Page;
import com.Pom.pkg.HomePage;
import com.Pom.pkg.Payments_Info_Page;
import com.hopestar.GenericUtility.BaseClass;
@Listeners(com.hopestar.GenericUtility.IListenImpClass.class)
public class Integration_Payment_Add_EditByClient_Test extends  BaseClass {
	

	String RID=null;



		@Test(groups = "integration",invocationCount = 2)
		public void Payment_Add_EditByClient()throws Throwable {
		
			HomePage hp = new HomePage(driver);
			Payments_Info_Page pip = new Payments_Info_Page(driver);
			AddPayment_Page app = new AddPayment_Page(driver);
		// step-02 Click On Payments Module
				hp.clickPayments();
		// step-03 Click on Add Payments Button
					pip.clickAddPaymentBtn();
		
		// step-04 Enter The valid data In the required Fields and click on submit button
				 RID=	driver.findElement(By.xpath("//input[@name='recipt_no']")).getAttribute("value");
					String CIId=app.addPaymentt("Payments", 1);
		// step-05  Click On Clients  Module
	     	hp.clickClients();
	    // step-06 Click On Clients Status hyperlink of client  who paid
	     	app.ClientStatus(driver, CIId);
	     	System.out.println(RID);
	    //Validation
	     	WebElement ele = driver.findElement(By.xpath("//table[@class='table']/descendant::td[text()='"+RID+"']"));
	     	wu.waitForElementVisiblity(driver, ele);
	     	String VRid=ele.getText();
	     	Assert.assertTrue(VRid.equals(RID), "Payment Not Added");
	  
			System.out.println("payment added to client");
	  
	}
		@Test 
		public void m1()
		{
			System.out.println("pass");
		}

@DataProvider
public Object[][] dataProviding()throws Throwable
{
Object[][] obj = eu.dataProviding("Payments");
	return obj;

}}

