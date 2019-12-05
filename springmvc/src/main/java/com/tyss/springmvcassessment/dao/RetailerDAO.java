package com.tyss.springmvcassessment.dao;

import java.util.List;

import com.tyss.springmvcassessment.dto.OrderBean;
import com.tyss.springmvcassessment.dto.Product;
import com.tyss.springmvcassessment.dto.RetailerBean;

public interface RetailerDAO {
	
	public int createProfile(RetailerBean bean);
	public RetailerBean login(int id,String password);
	public Product search(int pid);
	public boolean updatePassword(int id,String password);
	public double totalAmount(int id);
	public List<OrderBean> getOrders(int id);
	public boolean doOrder(int p,int quantity,int retailerid);
	
	

}
