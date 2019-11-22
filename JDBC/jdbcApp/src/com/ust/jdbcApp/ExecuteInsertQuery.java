package com.ust.jdbcApp;

import java.sql.Connection;

import com.mysql.jdbc.Driver;

import java.sql.*;
public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			//Load the Driver
			com.mysql.jdbc.Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			//get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			//issue the sql query
			String sql = "insert into Employee_Info values(?,?,?,?)";
			//stmt = con.createStatement();
			pstmt = con.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String sal = args[2];
		    int salary = Integer.parseInt(sal);
		    pstmt.setInt(3, salary);

		    String gen =args[3];
		    pstmt.setString(4, gen);
		    
		    int count = pstmt.executeUpdate();
			
			//Read the Result
			System.out.println(count +" Rows inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(con!=null) {
					con.close();}
//				}if(stmt!=null) {
//					stmt.close();
//				}
					if(pstmt!=null) {
						pstmt.close();
					}
				}catch(SQLException e) {
				e.printStackTrace();
			}
	}
		
	
		
	}//end of main()
}//end of ExecuteInsertQuery
