package com.wipro.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemoPS {

	public static void main(String[] args) {


			Connection conn =	DBUtil.getDBConnection();
			
	String query = "select eid,ename ,salary from Employees ";
	
	//String query = "select eid,ename ,salary from Employees where salary > ? ";
			
			try {
				PreparedStatement pstmt =	conn.prepareStatement(query);
				
				
				//pstmt.setDouble(1, 50000);
				
				ResultSet rs =	pstmt.executeQuery();
						
				while(rs.next()) {
					
					
System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getDouble("salary"));
					
					
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
