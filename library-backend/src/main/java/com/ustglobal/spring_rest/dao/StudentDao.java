package com.ustglobal.spring_rest.dao;

import java.util.List;

import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookRegistration;

public interface StudentDao {

	
	public Book searchBook(int  bid);
	
	public boolean requestBook(BookRegistration book);
}
