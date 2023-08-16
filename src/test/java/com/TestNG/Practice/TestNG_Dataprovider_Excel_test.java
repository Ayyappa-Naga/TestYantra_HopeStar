package com.TestNG.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.ExcelUtility;

public class TestNG_Dataprovider_Excel_test {
	
	@Test(dataProvider = "genericDatapro") 
	public void fetchDataExcel(String Dep_name,String Dep_No,String ID, String name)
	{
		
			System.out.println("Dep_name  :"+Dep_name+"Dep_No  :"+ Dep_No+"ID   :" +ID+  "name  : "+name);
		}
	
	@DataProvider
	public Object[][] genericDatapro() throws Throwable
	{
	ExcelUtility eu = new ExcelUtility();
	Object[][] ob = eu.dataProviding("Test_Only");
	return ob;
	}

}
