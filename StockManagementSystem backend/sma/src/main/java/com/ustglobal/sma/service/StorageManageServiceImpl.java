package com.ustglobal.sma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.sma.dao.StoreManagerDAO;
import com.ustglobal.sma.dto.OrderInfo;
import com.ustglobal.sma.dto.Products;

@Service
public class StorageManageServiceImpl implements StorageManageService {
	

	@Autowired
	private StoreManagerDAO dao;

	@Override
	public boolean addProduct(Products products) {
		
		return dao.addProduct(products);
	}

	@Override
	public Products getProductById(int id) {
		return dao.getProductById(id);
	}

	@Override
	public Products getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<Products> getProductByCatagory(String catagory) {
		return dao.getProductByCatagory(catagory);
	}

	@Override
	public List<Products> getAllProduct() {
		return dao.getAllProduct();
	}


	@Override
	public boolean deleteProductById(int id) {
		return dao.deleteProductById(id);
	}

	@Override
	public boolean addToCart(OrderInfo orders) {
		return dao.addToCart(orders);
	}

	

}
