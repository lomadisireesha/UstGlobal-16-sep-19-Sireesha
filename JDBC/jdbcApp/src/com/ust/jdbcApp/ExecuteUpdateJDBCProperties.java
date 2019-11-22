package com.ust.jdbcApp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteUpdateJDBCProperties {
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
	
			String sql = prop.getProperty("update-query");
			pstmt = con.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal =args[2];
			int sal =Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setInt(4,id);
			pstmt.setString(1, name);
			pstmt.setInt(2,sal);
			pstmt.setString(3,gender);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + " rows updated");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
//				}
					if(pstmt!=null) {
						pstmt.close();
					}
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
