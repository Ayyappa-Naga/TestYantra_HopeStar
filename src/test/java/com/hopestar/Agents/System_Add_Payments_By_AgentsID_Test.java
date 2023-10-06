package com.hopestar.Agents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pom.pkg.AddPayment_Page;
import com.Pom.pkg.HomePage;
import com.Pom.pkg.Payments_Info_Page;
import com.hopestar.GenericUtility.BaseClass;

@Listeners(com.hopestar.GenericUtility.IListenImpClass.class)
public class System_Add_Payments_By_AgentsID_Test extends BaseClass {
	HomePage hp;
	Payments_Info_Page pf;
	AddPayment_Page ap;
	String TR_No;
public String hhh="fvds";
	@Test(groups = "system")
	public void addPaymentsByAgentsID() throws Throwable {
		
		WebElement element;
		try {

		} finally {
			final int a = 10;
		}

		hp = new HomePage(driver);
		pf = new Payments_Info_Page(driver);
		ap = new AddPayment_Page(driver);
		// step-02 Click On Agents Module
		hp.clickAgents();
		String AgentID = ap.getAgentid();
		// step-03 Click On Payments Module
		hp.clickPayments();
		// step-04 Click On Add Payment Button
		pf.clickAddPaymentBtn();
		// step-05 Enter valid data in required Fields and click on Submit Button
		TR_No = driver.findElement(By.name("recipt_no")).getAttribute("value");
		WebElement ele = driver.findElement(By.xpath("//input[@name='agent_id']"));
		ele.clear();
		ele.sendKeys(AgentID,Keys.ARROW_DOWN);

		ap.addPaymentt("Agents", 1);
		// step-06 Click On Payments Module
		hp.clickPayments();
		// Validation
		wu.scrollToPageEnd(driver);
		WebElement table = driver.findElement(By.xpath("//table"));
		WebElement TransactionNo = driver.findElement(By.xpath("//td[.='" + TR_No + "']"));
		wu.waitForElementVisiblity(driver, TransactionNo);

		String PaymentsList = table.getText();
		AssertJUnit.assertTrue(PaymentsList.contains(TR_No));
		System.out.println("Payment added Successfully");

	}

	@DataProvider
	public Object[][] dataAddPayment() throws Throwable {
		Object obj[][] = eu.dataProviding("Agents");
		return obj;
	}

}
