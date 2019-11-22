package com.ust.EmpData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;
import com.ust.EmpData.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from Employee_Info";
		Connection con = null;
		Statement stmt =null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url);
			
			stmt =con.createStatement();
			rs = stmt.executeQuery(sql);
			ArrayList<EmployeeBean> result = new ArrayList<>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name =rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);
				
				result.add(bean);
			}
			return result;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(con!=null) {
					con.close();}
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}
		public EmployeeBean serachEmployeeData(int id) {
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String sql = "select * from Employee_Info where id =?";
			Connection con = null; 
			PreparedStatement pstmt= null;
			ResultSet rs = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url);
				
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					EmployeeBean bean = new EmployeeBean();
					bean.setId(rs.getInt("id"));
					bean.setName(rs.getString("name"));
					bean.setSal(rs.getInt("sal"));
					bean.setGender(rs.getString("gender"));
					return bean;
					
				}else {
					return null;
				}
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				try {
					if(con!=null) {
						con.close();}
						if(pstmt!=null) {
							pstmt.close();
						}
						if(rs!=null) {
							rs.close();
						}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
			}
						@Override
			public void insertEmployeeData() {
				String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				String sql = "insert into Employee_Info values(?,?,?,?)";
				try(FileReader in = new FileReader("csv.txt");
						BufferedReader reader = new BufferedReader(in);
						Connection con = DriverManager.getConnection(url);
						PreparedStatement pstmt = con.prepareStatement(sql)){
							while(reader.ready()) {
								String line = reader.readLine();
								String[] data = line.split(",");
								int id = Integer.parseInt(data[0]);
								String name = data[1];
								int sal = Integer.parseInt(data[2]);
								String gender = data[3];
								
								pstmt.setInt(1, id);
								pstmt.setString(2, name);
								pstmt.setInt(3,sal);
								pstmt.setString(4,gender);
								
								pstmt.addBatch();
							}
								int[] count = pstmt.executeBatch();
								System.out.println(count.length+"Row inserted");
							
						}catch(Exception e) {
							e.printStackTrace();
						}

			
			}
			@Override
			public int updateEmployeeData(EmployeeBean bean) {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int deleteEmployeeData(int id) {
				// TODO Auto-generated method stub
				return 0;
			}

	
}