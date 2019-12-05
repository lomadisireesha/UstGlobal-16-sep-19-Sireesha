package com.tyss.springmvcassessment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="ordertable")
public class OrderBean {
	
	@Id
	@Column
	@GeneratedValue
	private int orderid;
	@Column
	private String productname;
	@Column
	private double priceperunit;
	@Column
	private int quantity;
	@Column
	private double amountpayable;
	
	@Column
	private int retailerid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	private Product product;
	

	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getRetailerid() {
		return retailerid;
	}
	public void setRetailerid(int retailerid) {
		this.retailerid = retailerid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPriceperunit() {
		return priceperunit;
	}
	public void setPriceperunit(double priceperunit) {
		this.priceperunit = priceperunit;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmountpayable() {
		return amountpayable;
	}
	public void setAmountpayable(double amountpayable) {
		this.amountpayable = amountpayable;
	}
	
	

}
