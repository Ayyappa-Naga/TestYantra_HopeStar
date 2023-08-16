package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData_Write_Test {

	public static void main(String[] args)throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("Sheet1");
		 sh.createRow(1).createCell(1).setCellValue("Cookies");
		 FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		 wb.write(fos);
		 wb.close();
		 

	}

}
