package com.hopestar.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Java_Utility {
	/**
	 * This Method is used to get Random Number
	 * @author Ayyappa$Naga
	 * @return
	 */
	public int randomNum() {
		Random r = new Random();
		int random=r.nextInt(500);
		String sfdtring="sdfaf";
		Character character='s';
		
		return random;
		
		
	}

	/**
	 * This Method is used to get System Date
	 * @author Ayyappa$Naga
	 * @return
	 */
	public String getSystemDate() {
		Date d = new Date();
		String date = d.toString();
		return date;
	}
	/**
	 * This Method is used to get System Date in format
	 * @author Ayyappa$Naga
	 * @return
	 */
	public String getSystemDateInFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hhh-MM-ss");
		Date d = new Date();
		String SystemDateInformat=sdf.format(d);
		return SystemDateInformat;

	}



}
