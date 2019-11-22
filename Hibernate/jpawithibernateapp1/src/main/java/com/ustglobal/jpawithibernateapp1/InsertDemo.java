package com.ustglobal.jpawithibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernateapp1.dto.Employee_ust;

public class InsertDemo {

	public static void main(String[] args) {


		Employee_ust  ust = new Employee_ust();

		ust.setEmpid(1);
		ust.setEname("Lakshmi");
		ust.setEdeptno(10);

		Employee_ust  ust1 = new Employee_ust();

		ust1.setEmpid(2);
		ust1.setEname("karthik C");
		ust1.setEdeptno(20);

		Employee_ust  ust3 = new Employee_ust();

		ust3.setEmpid(3);
		ust3.setEname("sachin");
		ust3.setEdeptno(20);

		Employee_ust  ust4 = new Employee_ust();

		ust4.setEmpid(4);
		ust4.setEname("lucky");
		ust4.setEdeptno(20);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(ust);
		entityManager.persist(ust1);
		entityManager.persist(ust3);
		entityManager.persist(ust4);
		
		System.out.println("USTGLOBAl employee db inserted....");
		entityTransaction.commit();

		entityManager.close();







	}

}
