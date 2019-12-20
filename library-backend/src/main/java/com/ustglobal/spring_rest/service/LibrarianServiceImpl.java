package com.ustglobal.spring_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.spring_rest.dao.LibrarianDao;
import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookIssue;
import com.ustglobal.spring_rest.dto.BookRegistration;
import com.ustglobal.spring_rest.dto.User;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDao dao;

	@Override
	public Boolean addBooks(Book book) {
		
		return dao.addBooks(book);
	}

	@Override
	public Boolean deleteBook(int bid) {
		
		return dao.deleteBook(bid);
	}

	@Override
	public User getStudentInfo(int id) {
		
		return dao.getStudentInfo(id);
	}

	@Override
	public List<BookRegistration> viewRequest() {
		
		return dao.viewRequest();
	}

	@Override
	public Book checkAvailability(int bid) {
		
		return dao.checkAvailability(bid);
	}

	@Override
	public List<Book> showAllBooks() {
		
		return dao.showAllBooks();
	}

	@Override
	public boolean issuedBook(BookIssue bookissue) {
		
		return dao.issuedBook(bookissue);
	}

	@Override
	public List<BookIssue> diplayIssuedBooks() {
		
		return dao.diplayIssuedBooks();
	}

	@Override
	public Boolean deleterequest(int bookId) {
		
		return dao.deleterequest(bookId);
	}

}
