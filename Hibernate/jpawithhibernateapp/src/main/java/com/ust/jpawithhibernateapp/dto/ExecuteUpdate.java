package com.ust.jpawithhibernateapp.dto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ExecuteUpdate {
		public static void main(String[] args) {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				con = DriverManager.getConnection(url);
				
				String sql = "update Employee_Info set name=?,sal=?,gender=? where id=?";
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
//					}
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

