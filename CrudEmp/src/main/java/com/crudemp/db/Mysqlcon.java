package com.crudemp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlcon {

	public static void main(String args[]) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/emp";
		&lt;hostname&gt;/&lt;database&gt;
		String username = "root";
		String password = "techouts";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			if (st != null) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
