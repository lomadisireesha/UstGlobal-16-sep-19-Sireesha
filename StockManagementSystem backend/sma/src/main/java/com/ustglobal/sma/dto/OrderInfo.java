package com.ustglobal.sma.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private double totalPrice;
	@Column
	private double priceWithGST;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getPriceWithGST() {
		return priceWithGST;
	}
	public void setPriceWithGST(double priceWithGST) {
		this.priceWithGST = priceWithGST;
	}

}
