package com.hopestar.homepage;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pom.pkg.HomePage;
import com.hopestar.GenericUtility.BaseClass;


public class System_Clientstatus_From_Nominee_BySearch_Test extends  BaseClass {

	@Test(groups = "system")
	public void clientstatus_From_Nominee_BySearch( )throws Throwable {
HomePage hp = new HomePage(driver);
		
	//get Data From Hopetstar Excel File
		String cid=eu.readDataFromExcel("Search", 1, 1);	
		//step-02 Click On Search TextBox  And Enter Client ID
			hp.getSearchBox().sendKeys(cid);
		//step-03 Click On Search Button
			hp.getSearchBtn().click();
		//step-04 Click On Client Status Link in Nominee Panel
			driver.findElement(By.xpath("//td[text()='"+cid+"']/../descendant::a[text()='Client Status']")).click();
		//validation
		String Client_id=	driver.findElement(By.name("client_id")).getAttribute("value");
		Assert.assertTrue(Client_id.equals(cid),"not Displayed");
				System.out.println("Client Status Of searched Client Displayed");
		
	}

}
