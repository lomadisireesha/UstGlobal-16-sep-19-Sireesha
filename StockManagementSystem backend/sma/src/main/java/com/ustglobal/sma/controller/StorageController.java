package com.ustglobal.sma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.sma.dto.OrderInfo;
import com.ustglobal.sma.dto.Products;
import com.ustglobal.sma.service.StorageManageService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class StorageController {
	@Autowired
	private StorageManageService service;
	
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean addProduct(@RequestBody Products products) {
		boolean isAdded = false;
		service.addProduct(products);
		isAdded = true;
		return isAdded;
	}
	
	@GetMapping(path = "/getAll",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Products> showAllProducts() {
		return service.getAllProduct();

	}
	@PostMapping(path = "/addToCart/{pid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addToCart(@PathVariable("pid")int pid ,OrderInfo products ) {
		return service.addToCart(products);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public boolean deleteProductById(@PathVariable("id") int id) {
		return service.deleteProductById(id);
	}
	@GetMapping(path="/search/{pid}",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
	public Products getProductById(@PathVariable("pid")int pid) {
		Products pp = service.getProductById(pid);
			return pp;

	}
	@GetMapping(path="/searchbyName/{pname}",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
	public Products getProductByName(@PathVariable("pname") String pname) {
		return service.getProductByName(pname);
	}
	
	@GetMapping(path="/searchbyCat/{category}",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Products>  getProductByCategory(@PathVariable("category") String category) {
		return service.getProductByCatagory(category);
	}
	
	
}
