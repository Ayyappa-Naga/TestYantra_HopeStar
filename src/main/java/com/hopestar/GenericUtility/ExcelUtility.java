package com.hopestar.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility 

{
	/**
	 * This Method is used to read data from single Cell
	 * @author Ayyappa$Naga
	 * @param Sheetname
	 * @param rowNum
	 * @param colNum
	 * @return
	 * @throws Throwable
	 */
	public String  readDataFromExcel(String Sheetname,int rowNum,int colNum)throws Throwable {
		FileInputStream fi = new FileInputStream(IPathConstant.TestData);
		Workbook book = WorkbookFactory.create(fi);
		String value=book.getSheet(Sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}

	/**
	 * This Method is used to Read Multiple Data using map
	 * @author Ayyappa$Naga
	 * @param sheetName
	 * @param keyCellNo
	 * @param valueCellNo
	 * @return
	 * @throws Throwable
	 */
	public HashMap<String, String> readMultiDataM(String sheetName,int keyCellNo,int valueCellNo)throws Throwable
	{
		FileInputStream fim = new FileInputStream(IPathConstant.TestData);
		Workbook book = WorkbookFactory.create(fim);
		Sheet sh=book.getSheet(sheetName);
		int rowcount = sh.getLastRowNum();
		HashMap<String, String> map = new HashMap<>();
		for(int i=1;i<=rowcount;i++) {
			String key=sh.getRow(i).getCell(keyCellNo).getStringCellValue();
			String value=sh.getRow(i).getCell(valueCellNo).getStringCellValue();
			map.put(key, value);
		}
		return map;

	}

	/**
	 * This Method is used to write data into a single cell
	 * @author Ayyappa$Naga
	 * @param sheetName
	 * @param valuetoSet
	 * @throws Throwable
	 */
	public void writeDataToExcel(String sheetName,String valuetoSet)throws Throwable
	{
		FileInputStream fim = new FileInputStream(IPathConstant.TestData);
		Workbook book = WorkbookFactory.create(fim);
		Sheet sh=book.getSheet(sheetName);
		sh.createRow(0).createCell(0).setCellValue(valuetoSet);
		FileOutputStream fos = new FileOutputStream(IPathConstant.TestData);
		book.write(fos);
		book.close();

	}
	
	/**
	 * This method is used to get the last row of the sheet
	 * @author Ayyappa$Naga
	 * @param sheetName
	 * @return
	 * @throws Throwable
	 */
	public int lastRow(String sheetName)throws Throwable {
		FileInputStream fim = new FileInputStream(IPathConstant.TestData);
		Workbook book = WorkbookFactory.create(fim);
		Sheet sh=book.getSheet(sheetName);
		int lastNum=sh.getLastRowNum();
		return lastNum;

	}
	
	/**
	 * This Method is Used to get Multiple data From Excel 
	 * @author Ayyappa$Naga
	 * @param sheetName
	 * @param keycollNo
	 * @param valuecolNo
	 * @return
	 * @throws Throwable
	 */
	public HashMap<String, String> MultiDataExcel(String sheetName,int keycollNo,int valuecolNo) throws Throwable
	{
HashMap<String,String > map = new  HashMap<String, String>();
		
		for(int i=1;i<=lastRow(sheetName);i++) 
		{
			String key=readDataFromExcel(sheetName, i, keycollNo);
			String Value=readDataFromExcel(sheetName, i, valuecolNo);
			
			map.put(key, Value);
			
		}
		return map;
	}
	
	/**
	 * This Method is Used to get the Data from excel store in array 2D
	 * @author Ayyappa$Naga
	 * @return
	 * @throws Throwable
	 */
	public Object[][]  dataProviding(String SheetName)throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.TestData);
	 Workbook book=	WorkbookFactory.create(fis);
	 Sheet sh =book.getSheet(SheetName);
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
