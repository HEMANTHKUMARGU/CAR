package com.impaqx.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	static final String URL = "jdbc:mysql://localhost:3306/impaqx";
	public static final String USER = "root";
	public static final String PASSWORD = "Hemanth@123";
	private static Connection conn;

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

}
