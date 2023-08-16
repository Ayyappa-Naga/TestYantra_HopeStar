package com.hopestar.Nominee;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pom.pkg.Clients_StatusPage;
import com.Pom.pkg.Edit_ClientPage;
import com.Pom.pkg.HomePage;
import com.Pom.pkg.Nominee_Informationpage;
import com.hopestar.GenericUtility.BaseClass;


public class System_Edit_Client_By_Nominee_Test extends  BaseClass {

					@Test(groups = "system")
				public  void edit_Client_By_Nominee()throws Throwable {

				HomePage hp = new HomePage(driver);
				Nominee_Informationpage nip = new Nominee_Informationpage(driver);
				Clients_StatusPage csp = new Clients_StatusPage(driver);
				Edit_ClientPage ecp = new Edit_ClientPage(driver);
		//step-02 Click On Nominee Module
			    hp.clickNominee();
		//step-03 Click On Client Status Hyper Link
			    String id=eu.readDataFromExcel("Nominee", 1, 1);
			    nip.clientsStatus(id, driver);
		//step-04 Click On Edit Client In Client status page
			   csp.clickEditClient();
		//step-05 Modify Data in the required Fields and click On Update Button
			ecp.editClientData(driver);
		//Validating	    
			  String Success=  driver.findElement(By.xpath("//div[@class='col-md-12']")).getText();
			  Assert.assertTrue(Success.contains("Client record updated successfully"), "client data Not Updated");
			    
			    	System.out.println("Client Data Updated");
	}

}
