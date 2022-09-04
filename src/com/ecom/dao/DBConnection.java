package com.ecom.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String user = "root";
	private static String password = "root";
	private static String url = "jdbc:mysql://localhost:3306/ecom";
	private static Connection con = null;

	public static Connection getConnection() {
		if (con == null) {
			try {

				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);

			} catch (ClassNotFoundException e) {
				System.out.println("Driver not Found");
			} catch (SQLException e) {
				System.out.println("Mysql Connection not found");
			}
		}
		return con;
	}
}
