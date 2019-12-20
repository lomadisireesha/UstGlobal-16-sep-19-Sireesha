package com.ustglobal.spring_rest.service;

import java.util.List;

import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookRegistration;

public interface StudentService {

	public Book searchBook(int bid );
	
	public boolean requestBook(BookRegistration book);
}