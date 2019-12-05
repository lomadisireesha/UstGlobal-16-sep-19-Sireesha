package com.ust.springrest.dto;

import java.util.List;

public class EmployeeResponse {
		private int statuscode;
		private List<EmployeeBean> employeebeans;
		public List<EmployeeBean> getEmployeebeans() {
			return employeebeans;
		}
		public void setEmployeebeans(List<EmployeeBean> employeebeans) {
			this.employeebeans = employeebeans;
		}
		private String msg;
		private String description;
		public int getStatuscode() {
			return statuscode;
		}
		public void setStatuscode(int statuscode) {
			this.statuscode = statuscode;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
}
