package com.ust.filehandling;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;



public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection con = null;//interface
		Statement stmt = null;//interface
		ResultSet rs = null;//interface
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			String url = prop.getProperty("url");
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			//DriverManager.registerDriver(driver);
			
			con =  DriverManager.getConnection(url,prop);
			stmt = con.createStatement();
			
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
				
		}catch(Exception e) {
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
				if(reader!=null)
				{
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
