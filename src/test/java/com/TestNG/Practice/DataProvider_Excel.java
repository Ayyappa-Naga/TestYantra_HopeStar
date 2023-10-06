package com.TestNG.Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hopestar.GenericUtility.IPathConstant;


public class DataProvider_Excel {
	
	@Test(dataProvider = "dataProviding")
	public void dataFetching(String Dep_name,String Dep_No,String ID, String name)
	{
		System.out.println("Dep_name  :"+Dep_name+"Dep_No  :"+ Dep_No+"ID   :" +ID+  "name  : "+name);
	}
	
	
	
	
	@DataProvider
	public Object[][]  dataProviding()throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.TestData);
	 Workbook book=	WorkbookFactory.create(fis);
	 Sheet sh =book.getSheet("Test_Only");
	 int lastrow = sh.getLastRowNum();
	 int lastCell =sh.getRow(1).getLastCellNum();
			 Object[][] obj= new Object[lastrow][lastCell];
			 for(int i=1;i<=lastrow;i++)
			 {
				 for(int j=0;j<lastCell;j++)
				 {
					DataFormatter df = new DataFormatter();
					
							 Cell cell=sh.getRow(i).getCell(j);
							 obj[i-1][j]=df.formatCellValue(cell);
				 }
			 }
			 return obj;
	}


}
