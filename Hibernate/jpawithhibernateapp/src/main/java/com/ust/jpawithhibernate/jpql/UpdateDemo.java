package com.ust.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class UpdateDemo {
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {
		EntityManager entityManager = null;
		try {
		 EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
		 entityTransaction .begin();
		// String jpql = "update Product set pname='Scale' where pid=2";
		 String jpql = "Delete from Product where pid=3";
		 Query	query =entityManager.createQuery(jpql);
		 int result = query.executeUpdate();
		 System.out.println(result);
		 entityTransaction.commit();
		 entityManager.close();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction .rollback();
		}finally {
			entityManager.close();
		}
}
}