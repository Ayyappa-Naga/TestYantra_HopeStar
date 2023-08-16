package com.hopestar.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DataBase_Utility {
	Connection con = null;

	/**
	 * This Method is used to get connection to the database
	 * 
	 * @author Ayyappa$Naga
	 * @throws SQLException
	 */
	public void ConnectToDB() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstant.dburl, IPathConstant.db_UName, IPathConstant.db_Pass);
	}

	/**
	 * This Method is Used To execute the Query and get
	 * 
	 * @author Ayyappa$Naga
	 * @param Query
	 * @param col_Index
	 * @param Expected_Data
	 * @return
	 * @throws SQLException
	 */
	public String Execute_Query(String Query, int col_Index, String Expected_Data) throws SQLException {
		ResultSet result = con.createStatement().executeQuery(Query);
		boolean flag = false;
		while (result.next()) {
			String act_Data = result.getString(col_Index);
			if (act_Data.equalsIgnoreCase(Expected_Data)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Data Verified");
			return Expected_Data;
		} else {
			System.out.println("Data Not Verified");
			return "";
		}
	}

	/**
	 * This Method is Used to close the Connection to the database
	 * 
	 * @author Ayyappa$Naga
	 * @throws SQLException
	 */
	public void connectionClose() throws SQLException {
		con.close();

	}

}
