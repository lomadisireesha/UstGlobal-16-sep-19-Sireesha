package com.ustglobal.sma.dao;

import java.util.List;

import com.ustglobal.sma.dto.OrderInfo;
import com.ustglobal.sma.dto.Products;

public interface StoreManagerDAO {
	public boolean addProduct(Products products);
	public Products getProductById(int id);
	public Products getProductByName(String name);
	public List<Products> getProductByCatagory(String catagory);
	public List<Products> getAllProduct();
	
	public boolean deleteProductById(int id);
	public boolean addToCart(OrderInfo orders);
	
}
