package com.ustglobal.jpawithibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp1.dto.Employee_ust;

public class UpdateDemo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			Employee_ust e= entityManager.find(Employee_ust.class, 3);
			e.setEdeptno(10);
			System.out.println("one row is updated......");
			
			entityTransaction.commit();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
		
		
		
		
		
		
		
	}

}
