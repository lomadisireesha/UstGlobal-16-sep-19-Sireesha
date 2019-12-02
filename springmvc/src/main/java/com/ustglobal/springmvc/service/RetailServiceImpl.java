package com.ustglobal.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvc.dao.RetailerDAO;
import com.ustglobal.springmvc.dto.Order;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.RetailBean;
@Service
public class RetailServiceImpl implements RetailService{
	@Autowired
	private RetailerDAO dao ;
	@Override
	public RetailBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(RetailBean bean) {
		return dao.register(bean);
	}

	

	@Override
	public boolean updatePassword(int id , String password) {
		return dao.updatePassword(id,password);
	}

	

	@Override
	public List<Order> getProducts(String email) {
		return dao.getProducts(email);
	}

	@Override
	public boolean buyProduct(RetailBean user,Product product,int quantity) {
		Order orderProduct=new Order();
		orderProduct.setPrice(product.getPrice());
		orderProduct.setEmail(user.getEmail());
		int total=product.getPrice()*quantity;
		orderProduct.setTotal(total);
		orderProduct.setName(product.getName());
		orderProduct.setQuantity(quantity);	
		return dao.buyProduct(orderProduct);
	}

	@Override
	public Product searchproduct(String pname) {
		return dao.search(pname);
	}


}
