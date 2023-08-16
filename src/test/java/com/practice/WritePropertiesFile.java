package com.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		String path = ".\\src\\test\\resources\\CommonData.properties";
		
		File file = new File(path);
		file.createNewFile();
		
		Properties pr = new Properties();
		pr.setProperty("FirstName", "Avinash");
		pr.setProperty("LastName", "Mishra");
		
		FileOutputStream fis = new FileOutputStream(file);
		pr.store(fis, "Test Data");
		
		fis.close();
		

	}

}