package com.shopkro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static String url ="jdbc:mysql://localhost:3306/mysql";
	private static String user ="root";
	private static String password="8539909495";
	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		System.out.println("building connection");
		return DriverManager.getConnection(url,user,password);
	}
}
