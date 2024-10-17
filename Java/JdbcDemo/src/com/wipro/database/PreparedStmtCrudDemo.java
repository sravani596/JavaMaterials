package com.wipro.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtCrudDemo {

	public static void main(String[] args) {

		Connection conn = DBUtil.getDBConnection();
		
		//String query = "insert into Employees values(?,?,?)"; // ? --> positional parameters
		
		String query = "update Employees set Ename = ? , Salary = ?  where eid = ? ";
		
		// String query = "delete from Employees where eid = ?";
		      try { 
		    	  
		    	  
		PreparedStatement pstmt =		conn.prepareStatement(query);
		
			// setting insert query values to positional params	
		/*
		 * pstmt.setInt(1, 104); pstmt.setString(2, "javeed"); pstmt.setDouble(3,
		 * 75000);
		 */
		
		// setting update query values to positional params	
		
		/*
		 * pstmt.setString(1,"tommy"); pstmt.setDouble(2, 40000); pstmt.setInt(3, 102);
		 */
		
				
				// pstmt.setInt(1,101);       // delete query param
			
			int count =		pstmt.executeUpdate(); // DML Dynamic queries
			
				System.out.println(count + " Rows affected");
			
		      
		      } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
