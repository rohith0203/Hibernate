package com.org.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDao {

	// EmpSetGet e=new EmpSetGet();
	public static Connection getconnection() {

		Connection con = null;
		try {

			String url = "jdbc:mysql://localhost:3306/emp";
			String user = "root";
			String password = "techouts";

			Class.forName("com.jdbc.mysql.Driver");

			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		return con;

	}

	public static int save(EmpSetGet e) throws SQLException {

		int status = 0;

		Connection con = EmpDao.getconnection();
		PreparedStatement ps = con.prepareStatement("insert into (name,password,country)values(?,?,?)");
		ps.setString(1, e.getName());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getCountry());
		status = ps.executeUpdate();
		con.close();

		return status;

	}

}
