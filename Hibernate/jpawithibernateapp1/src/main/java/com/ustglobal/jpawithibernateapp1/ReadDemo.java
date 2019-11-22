package com.ustglobal.jpawithibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp1.dto.Employee_ust;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		
		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			
		
			Employee_ust u = entityManager.find(Employee_ust.class, 2);
			System.out.println("empid ... " + u.getEmpid());
			System.out.println("ename ...." + u.getEname());
			System.out.println("edeptno ..." + u.getEdeptno());
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		entityManager.close();
		
		
		
		
	}
}
