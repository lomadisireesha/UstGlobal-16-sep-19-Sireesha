package com.ust.EmpData;

import java.util.List;

import com.ust.EmpData.dto.EmployeeBean;

public interface EmployeeDAO {
	public EmployeeBean serachEmployeeData(int id) ;
	public List<EmployeeBean> getAllEmployeeData();
	public void insertEmployeeData();
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
}
