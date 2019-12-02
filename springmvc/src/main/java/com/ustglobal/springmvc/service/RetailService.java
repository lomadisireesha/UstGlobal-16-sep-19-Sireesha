package com.ustglobal.springmvc.service;

import java.util.List;

import com.ustglobal.springmvc.dto.Order;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.RetailBean;

public interface RetailService {
	public RetailBean login(int id, String password);
	public int register(RetailBean bean);
	public Product searchproduct(String pname);
	public boolean updatePassword(int id,String password);
	public List<Order> getProducts(String email);
	public boolean buyProduct(RetailBean user,Product product,int quantity);
}
