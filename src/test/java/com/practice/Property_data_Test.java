package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;



public class Property_data_Test {

	public static void main(String[] args)throws Throwable {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		pro.load(fis);
		String URL = pro.getProperty("url");
		String BROWSER = pro.getProperty("browser");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\CommonData.properties");
	pro.put("keysss", "novalue");
	pro.store(fos, PASSWORD);

	}

}
