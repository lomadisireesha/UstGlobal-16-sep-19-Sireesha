package com.ustglobal.sma.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_history")
public class OrderHistory {
	@Id
	@Column
	private int OrderId;
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="pid" ,nullable=false)
	@Column
	private int Product_id;
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	

}
