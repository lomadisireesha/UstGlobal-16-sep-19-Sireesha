package com.ustglobal.jpawithibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp1.dto.Employee_ust;

public class DeleteDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		
		Employee_ust es = entityManager.find(Employee_ust.class, 1);
		
		entityManager.remove(es);
		
		System.out.println("one data from ust_global was removed....");
		
		entityTransaction.commit();
		
	
		
		entityManager.close();
		
		
		
		
		
		
		
		
	}

}
