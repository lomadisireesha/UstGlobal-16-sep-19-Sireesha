package com.ustglobal.jpawithibernateapp1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_ust")
public class Employee_ust {
	
	@Id
	@Column
	private int empid;
	
	@Column
	private String ename ;
	
	@Column
	private int edeptno;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEdeptno() {
		return edeptno;
	}

	public void setEdeptno(int edeptno) {
		this.edeptno = edeptno;
	}
	
	

}
