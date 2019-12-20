package com.ustglobal.spring_rest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name="Requested_Books")
public class BookRegistration {
	
	
	
	@Column(name="StudentId")
	@NotNull
	private int studentId;
	
	@Id
	@Column(name="bookId")
	@NotNull
	private int bookid;
	
	@Column(name="BookName")
	@NotNull
	private String bookName;
	
	@Column(name = "Author")
	@NotNull
	private String author;
	
	@Column(name="RequestedOn")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Past
	private Date date;
	


}
