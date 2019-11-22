package com.ust.jpawithhibernate.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data		
@Entity
@Table(name="Pencil")
public class Pencil {
	@Id
	@Column
		private int price ;
	@Column
		private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pricebox",nullable=false)
	private PencilBox PencilBox;
	
}
