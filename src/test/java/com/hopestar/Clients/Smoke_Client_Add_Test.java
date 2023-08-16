package com.hopestar.Clients;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Pom.pkg.Add_ClientPage;
import com.Pom.pkg.Clients_Informationpage;
import com.Pom.pkg.HomePage;
import com.Pom.pkg.LoginPage;
import com.hopestar.GenericUtility.BaseClass;
import com.hopestar.GenericUtility.ExcelUtility;
import com.hopestar.GenericUtility.File_Utility;
import com.hopestar.GenericUtility.WebDriver_Utility;

public class Smoke_Client_Add_Test extends  BaseClass {
	
	WebDriver_Utility wu = new WebDriver_Utility();
	ExcelUtility eu = new ExcelUtility();
	File_Utility fu = new File_Utility();
	String Cname=null;
	LoginPage lp;
	HomePage hp; 
	Clients_Informationpage cip ;
	Add_ClientPage acp; 
	@Test(groups = "smoke")
	public void clientAdd() throws Throwable {
		
	lp	 = new LoginPage(driver);
	hp	 = new HomePage(driver);
	cip	 = new Clients_Informationpage(driver);
		acp = new Add_ClientPage(driver);
	//step-02 Click On Clients Module
			hp.clickClients();
	//step-03 Click on ADD Client Button
				cip.clickAddClient();	
			
	
	//step-04 Enter valid data in all required fields and click on Submit
		Cname=acp.addClient("Clients", 1);
		
	//Validation
		hp.clickClients();
		String Clientdata=cip.getClientData().getText();
		Assert.assertTrue(Clientdata.contains(Cname),"Client Not Added");
		System.out.println("Client Added Successfully");

	}
	
	
	@DataProvider
	public Object[][] dataFromExcel()throws Throwable 
	{
		Object[][] obj = eu.dataProviding("Clients");
		return obj;
	}
	
}
