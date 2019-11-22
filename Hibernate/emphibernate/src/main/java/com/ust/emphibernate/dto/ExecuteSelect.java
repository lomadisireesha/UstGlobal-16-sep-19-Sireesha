package com.ust.emphibernate.dto;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
public class ExecuteSelect {
	public static void main(String[] args) {
		Connection con = null;//interface
		Statement stmt = null;//interface
		ResultSet rs = null;//interface
		try {
			//Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Get connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			con = (Connection) DriverManager.getConnection(url);
			stmt = (Statement) con.createStatement();
			
			// provide SQL Query
			String sql = "select * from Employee_Info";
			rs = stmt.executeQuery(sql);
			
		//Read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal =rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id : "+id);
				System.out.println("name is : "+name);
				System.out.println("sal is : "+sal);
				System.out.println("gender is : "+gender);
				System.out.println("**********************");
			}
				
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			//close all costly resources
			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

