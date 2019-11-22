package com.ust.jdbcApp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class InsertQueryWithJDBCProperties {
	public static void main(String[] args) {
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		FileReader reader = null;
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			String url = prop.getProperty("url");
			con =  DriverManager.getConnection(url,prop);
			Class.forName(prop.getProperty("driver-class-name"));
	
			String sql = prop.getProperty("insert-query");
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
		}catch(Exception e) {
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
				}catch(Exception e) {
				e.printStackTrace();
			}
	}
		

	}
}
