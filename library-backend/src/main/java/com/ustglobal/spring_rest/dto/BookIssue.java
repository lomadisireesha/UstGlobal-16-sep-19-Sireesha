package com.ustglobal.spring_rest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.NotFound;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;

@Data
@Entity
@Table(name = "Book_Issue_Details")
public class BookIssue {

	@Id
	@Column(name = "SNO")
	@GeneratedValue
	private int Sno = 0;
	
	@Column(name="BookId")
    @NotNull
	private int bookid;
	
	@Column(name="BookName")
	@NotNull
	private String bookName;
	
	@Column(name="IssueDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Past
	private Date issueDate;
	
	@Column(name="ReturnDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Future
	private Date returnDate;
	
	@Column(name="Fine")
	private int fine;
	
}
