package com.ustglobal.spring_rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookIssue;
import com.ustglobal.spring_rest.dto.BookRegistration;
import com.ustglobal.spring_rest.dto.User;

@Repository
public class LibrarianDaoImpl implements LibrarianDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	//	@Override
	//	public int registerStudent(User user) {
	//
	//		EntityManager entityManager = factory.createEntityManager();
	//		EntityTransaction entityTransaction = entityManager.getTransaction();
	//
	//		entityTransaction.begin();
	//		
	//		try {
	//			entityManager.persist(user);
	//			entityTransaction.commit();
	//			return user.getId();
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//			return -1;
	//		}
	//
	//	}
	//	@Override
	//	public Boolean deleteStudent(int id) {
	//		EntityManager entityManager = factory.createEntityManager();
	//		EntityTransaction entityTransaction = entityManager.getTransaction();
	//		entityTransaction.begin();
	//		User bean = entityManager.find(User.class, id);
	//		if(bean!= null) {
	//			entityManager.remove(bean);
	//			entityTransaction.commit();
	//			return true;
	//
	//		}else {
	//			return false;
	//		}
	//	}

	@Override
	public Boolean addBooks(Book book) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		try {
			entityManager.persist(book);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Boolean deleteBook(int bid) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Book bean = entityManager.find(Book.class, bid);
		if(bean!= null) {
			entityManager.remove(bean);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
	}
	@Override
	public Boolean deleterequest(int bookid) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		BookRegistration bean = entityManager.find(BookRegistration.class, bookid);
		if(bean!= null) {
			entityManager.remove(bean);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
	}	

	@Override
	public User getStudentInfo(int uid) {

		EntityManager entityManager = factory.createEntityManager();

		return entityManager.find(User.class, uid);
	}


	@Override
	public List<BookRegistration> viewRequest() {
		String jpql = "from BookRegistration";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<BookRegistration> query = entityManager.createQuery(jpql, BookRegistration.class);
		List<BookRegistration> BookRegistrations = query.getResultList();
		return BookRegistrations;
	}

	@Override
	public Book checkAvailability(int bid) {
		EntityManager entityManager = factory.createEntityManager();
		return  entityManager.find(Book.class, bid);
	}

	@Override
	public List<Book> showAllBooks() {
		String jpql = "from Book";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<Book> query = entityManager.createQuery(jpql, Book.class);
		List<Book> book = query.getResultList();
		return book;
	}

	@Override
	public boolean issuedBook(BookIssue bookissue) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		try {
			entityManager.persist(bookissue);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<BookIssue> diplayIssuedBooks() {

		String jpql = "from BookIssue";
		EntityManager entityManager = factory.createEntityManager();
		TypedQuery<BookIssue> query = entityManager.createQuery(jpql, BookIssue.class);
		List<BookIssue> bookissue = query.getResultList();
		return bookissue;
	}


}
