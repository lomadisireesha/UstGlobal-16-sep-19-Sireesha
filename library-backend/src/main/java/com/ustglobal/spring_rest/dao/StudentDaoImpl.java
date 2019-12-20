package com.ustglobal.spring_rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;

import com.ustglobal.spring_rest.dto.Book;
import com.ustglobal.spring_rest.dto.BookRegistration;

@Repository
public class StudentDaoImpl implements StudentDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean requestBook(BookRegistration book) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		try {
			entityManager.persist(book);
			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return true;

	}

	@Override   
	public Book searchBook(int bid) {
		EntityManager entityManager = factory.createEntityManager();

		return entityManager.find(Book.class, bid);
	}

}

