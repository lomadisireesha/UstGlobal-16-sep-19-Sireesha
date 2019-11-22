package com.ust.emphibernate.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


	public class ExecuteDelete {
		public static void main(String[] args) {
			Connection con = null;
			Statement stmt =null;
			
			try {
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				Class.forName("com.mysql.jdbc.Driver");
				
				String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				con = DriverManager.getConnection(url);
				
				String sql = "delete from Employee_Info where id=2";
				
				
				String empid = args[0];
				int id = Integer.parseInt(args[0]);
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(con!=null) {
						con.close();
					}if(stmt!=null) {
						stmt.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

