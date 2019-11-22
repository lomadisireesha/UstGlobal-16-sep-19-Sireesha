package com.ust.empapp.util;

import com.ust.EmpData.EmployeeDAO;
import com.ust.EmpData.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager() {
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	}
}
