package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Jdbc_10g {

	
		public static void main(String[] args) throws Exception {
			Driver jdriver = new Driver();
			DriverManager.registerDriver(jdriver);
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@//Magic:1521/Ocl.DB","scott","shiva");
			Statement state = conn.createStatement();
			String query ="select * from emp;";
			ResultSet r =state.executeQuery(query);
			while(r.next()) {
				System.out.println(r.getString(1));
			}
			conn.close();
			
			}

	}
