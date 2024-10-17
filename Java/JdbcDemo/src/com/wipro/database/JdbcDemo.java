package com.wipro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "admin");

			Statement stmt = conn.createStatement(); // for static queries DDL , select query

			// String query = " insert into Employees values(104,'ford',10000) ";

			// String query = "update Employees set ename = 'king khan' , salary = 80000
			// where eid = 101";

			// String query = "delete from Employees where eid = 104";

			// int count = stmt.executeUpdate(query);

			// System.out.println(count + " Records affected");

			String query = "select eid , ename , salary from Employees";  // static query

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {

				System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getDouble(3)); // 3 is
																											// column
																											// number

			}

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
