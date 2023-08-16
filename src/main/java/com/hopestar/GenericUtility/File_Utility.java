package com.hopestar.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	/**
	 * This Method is Used to Read Data from Properties File
	 * @author Ayyappa$Naga
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromProFile(String key)throws Throwable {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(IPathConstant.CommonFile);
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}

}
