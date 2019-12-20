package com.ustglobal.spring_rest.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "Books")
public class Book {
	
	@Id
	@Column
	private int bid;
	
	@Column
	@NotNull
	private String bName;
	
	@Column
	@NotNull
	private String author;
	
	
}
