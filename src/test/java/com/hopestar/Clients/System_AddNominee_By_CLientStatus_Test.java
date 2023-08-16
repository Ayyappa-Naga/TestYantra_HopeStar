package com.hopestar.Clients;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pom.pkg.AddNominee_Page;
import com.Pom.pkg.Clients_Informationpage;
import com.Pom.pkg.HomePage;
import com.Pom.pkg.Nominee_Informationpage;
import com.hopestar.GenericUtility.BaseClass;


public class System_AddNominee_By_CLientStatus_Test extends  BaseClass {
	String   Cid=null;
	String NomineeName=null;
	@Test(groups = "system")
	public  void addNominee() throws Throwable {

		HomePage hp = new HomePage(driver);
		AddNominee_Page anp = new AddNominee_Page(driver);
		Clients_Informationpage cip = new Clients_Informationpage(driver);
		Nominee_Informationpage nip = new Nominee_Informationpage(driver);
		
	//step-02  Click On Clients Module
	    hp.clickClients();
	    
	//step-03 Click On Client Status Of Perticular  Client 
	String   Cid=eu.readDataFromExcel("Clients",10 , 4);
	  cip.clickOnCs(Cid, driver);

	//step-04 Click On Add Nominee  Link
	   	    nip.clickAddNominee();
	//step-05 Enter All the required fields and click On Submit
	  NomineeName=anp.addNominee("Clients", 4);
	//step-06 Click On Nominee Module
	    hp.clickNominee();
	//Validation
	 String NomineeData=   driver.findElement(By.tagName("tbody")).getText();
	 Assert.assertTrue(NomineeData.contains(NomineeName));

		 System.out.println("Nominee Created Successfully");
	

	}
	
@DataProvider
	public Object[][] dataProviding() throws Throwable
	{
	    Object[][] obj = eu.dataProviding("Clients");	
	    return obj;
	}

}
