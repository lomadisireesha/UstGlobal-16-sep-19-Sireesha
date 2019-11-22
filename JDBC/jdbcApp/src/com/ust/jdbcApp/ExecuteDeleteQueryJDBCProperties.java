package com.ust.jdbcApp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteDeleteQueryJDBCProperties {
	public static void main(String[] args) {
		Connection con = null;
		//Statement stmt =null;
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
	
			String sql = prop.getProperty("delete_query");
			
			
			pstmt = con.prepareStatement(sql);
			
			//String empid = args[0];
			//int id = Integer.parseInt(args[0]);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			int count = pstmt.executeUpdate();
			
			System.out.println(count + "row deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
//				}if(stmt!=null) {
//					stmt.close();
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
