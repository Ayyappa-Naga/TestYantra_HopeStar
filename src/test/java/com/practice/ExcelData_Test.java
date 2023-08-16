package com.practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData_Test {

	public static void main(String[] args) throws Throwable{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
Workbook wb = WorkbookFactory.create(fis);
Sheet sh =wb.getSheet("Sheet1");
int num=sh.getLastRowNum();
int count=0;
for(int i=1;i<=num;i++) {
count=sh.getRow(2).getLastCellNum();
System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
	}
System.out.println(count);
}

}
