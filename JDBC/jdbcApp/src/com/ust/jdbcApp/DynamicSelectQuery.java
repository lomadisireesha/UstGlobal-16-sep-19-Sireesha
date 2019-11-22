package com.ust.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
public class DynamicSelectQuery {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql ="select * from Employee_Info where id=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			con = DriverManager.getConnection(url);
			
			pstmt =con.prepareStatement(sql);
			String empid =args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				int id1 = rs.getInt("id");
				int salary  = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("Id : "+id1);
				System.out.println("Name : "+name);
				System.out.println("Salary : "+salary);
				System.out.println("Gender : "+gender);
				System.out.println("********************************");
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		}
		
	}

