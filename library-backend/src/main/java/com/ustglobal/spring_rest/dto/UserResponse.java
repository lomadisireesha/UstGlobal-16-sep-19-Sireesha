package com.ustglobal.spring_rest.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {


	private int status;
	private String message;
	private String description;
	private List<User> users;
	private List<Book> book;
	private List<BookIssue> bookissue;
	private List<BookRegistration> requestedbook;

}

