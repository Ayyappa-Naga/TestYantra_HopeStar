 package com.practice;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SqlQuery_exe_Test {

	public static void main(String[] args) throws Exception {
		Driver jdriver = new Driver();
		DriverManager.registerDriver(jdriver);
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hopestar","root","Ayyappa@1");
		Statement state = conn.createStatement();
		String query ="select * from payment;";
		ResultSet r =state.executeQuery(query);
		while(r.next()) {
			System.out.println(r.getString(1)+"  "+r.getInt(2)+"  "+r.getInt(3)+"   "+r.getInt(4)+"  "+r.getString(5)+" "+r.getString(6));
		}
		conn.close();
		
		}

}
