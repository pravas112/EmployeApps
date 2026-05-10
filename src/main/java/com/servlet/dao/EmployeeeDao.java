package com.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeeDao {
	private static final String url="jdbc:mysql://localhost:3306/employeedb";
	private static final String username="root";
	private static final String password="root1122";
	
	public static Connection createDBConnection() {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(url, username, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
