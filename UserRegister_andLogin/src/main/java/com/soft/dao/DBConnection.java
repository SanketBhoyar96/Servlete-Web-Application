package com.soft.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	Connection con = null;
	
public Connection createConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_detailsdb","root","Sanket@123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	

}