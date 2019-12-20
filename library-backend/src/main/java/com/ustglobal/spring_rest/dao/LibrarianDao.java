package com.ustglobal.spring_rest.dao;

import java.util.List;

import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookIssue;
import com.ustglobal.spring_rest.dto.BookRegistration;
import com.ustglobal.spring_rest.dto.User;

public interface LibrarianDao {
	
//	public int registerStudent(User user);
//	public Boolean deleteStudent(int id) ;
	public Boolean addBooks(Book book) ;
	public Boolean deleteBook(int bid) ;
	public User getStudentInfo(int id) ;
	public List<BookRegistration> viewRequest() ;
	public Book  checkAvailability(int bid);
	public List<Book> showAllBooks() ;	
    public boolean issuedBook(BookIssue bookissue);
    public List<BookIssue> diplayIssuedBooks() ;	
    public Boolean deleterequest(int bookid ) ;



}	
