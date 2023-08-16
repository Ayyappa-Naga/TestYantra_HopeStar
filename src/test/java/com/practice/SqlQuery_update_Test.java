package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SqlQuery_update_Test {

	public static void main(String[] args) throws Exception {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopestar","root","Ayyappa@1");
		Statement state=con.createStatement();
		String query="insert into payment values('june',10000,500,100,'555','komali');";
		int r=state.executeUpdate(query);
		if(r>0) {
			System.out.println("data updated successfully");
		}
		else {
			System.err.println("data not updated");
			
		}

	}

}
