package com.ustglobal.spring_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.spring_rest.dao.StudentDao;
import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookRegistration;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao dao;
	


	@Override
	public boolean requestBook(BookRegistration book) {
		
		return dao.requestBook(book);
	}



	@Override
	public Book searchBook(int bid) {
		
		return dao.searchBook(bid);
	}
	

}
