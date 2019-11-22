package com.ust.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ust.EmpData.EmployeeDAO;
import com.ust.EmpData.EmployeeDAOImpl;
import com.ust.EmpData.dto.EmployeeBean;
import com.ust.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to get all employee data");
		System.out.println("press 3 to get all employee data");
		System.out.println("press 4 to get all employee data");
		System.out.println("press 5 to get all employee data");
		
		Scanner sc  = new Scanner(System.in);
		int ch =sc.nextInt();
		
		switch(ch) {
		case 1:EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		      List<EmployeeBean> result =   dao.getAllEmployeeData();
		      
		      for(EmployeeBean bean :result) {
		    	  System.out.println("Name: "+bean.getName());
		    	  System.out.println("Id: "+bean.getId());
		    	  System.out.println("Gender: "+bean.getGender());
		    	  System.out.println("Salary: "+bean.getSal());
		      }
		        break;
		case 2:
			
			break;
		case 3:EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
						dao3.insertEmployeeData();
			
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("enter id to search");
			int id =sc.nextInt();
			EmployeeBean bean = dao5.serachEmployeeData(id);
			if(bean!=null) {
				System.out.println("Name: "+bean.getName());
		    	  System.out.println("Id: "+bean.getId());
		    	  System.out.println("Gender: "+bean.getGender());
		    	  System.out.println("Salary: "+bean.getSal());
			}else {
				System.out.println("No data found");
			}
			break;
		        
		}
				}
		
	}

