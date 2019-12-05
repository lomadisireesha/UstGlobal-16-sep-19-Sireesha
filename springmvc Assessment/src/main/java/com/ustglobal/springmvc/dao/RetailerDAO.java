package com.ustglobal.springmvc.dao;

import java.util.List;

import com.ustglobal.springmvc.dto.Order;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.RetailBean;

public interface RetailerDAO {
	public RetailBean login(int id, String password);
	public int register(RetailBean bean);
	public Product search(String  pname);
	public boolean updatePassword(int  id,String password);
	public List<Order> getProducts(String email);
	public boolean buyProduct(Order orderProduct);
}
