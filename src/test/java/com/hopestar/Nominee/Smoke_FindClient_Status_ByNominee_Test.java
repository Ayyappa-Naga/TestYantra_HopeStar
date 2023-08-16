package com.hopestar.Nominee;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pom.pkg.HomePage;
import com.Pom.pkg.Nominee_Informationpage;
import com.hopestar.GenericUtility.BaseClass;



public class Smoke_FindClient_Status_ByNominee_Test extends  BaseClass {

	@Test(groups = "smoke")
	public  void findClient_Status_ByNominee()throws Throwable {
		HomePage hp = new HomePage(driver);
		Nominee_Informationpage nip = new Nominee_Informationpage(driver);
		//step-02 Click On Nominee Module
		hp.clickNominee();
		//step-03 Click On Client Status HyperLink 
		nip.clickNClientStatus();
		//validating
		String TitlePage=driver.findElement(By.xpath("//*[@class='page-head-line']")).getText();
		Assert.assertTrue(TitlePage.equals("CLIENT'S STATUS"));

			System.out.println("client's status page launched");
		
		
	}

}
