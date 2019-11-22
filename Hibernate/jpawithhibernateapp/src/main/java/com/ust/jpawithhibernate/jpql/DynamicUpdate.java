package com.ust.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdate {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction=null;
		try {
		 EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		 entityTransaction .begin();
		// String jpql = "update Product set pname=:pname where pid=:pid";
		 //String jpql = "Delete from Product where pid=3";
		 String jpql = "Delete from Product where pid=:pid";
		 Query	query =entityManager.createQuery(jpql);
//		 query.setParameter("pname", "Watch");
		 query.setParameter("pid", 2);
		 int result = query.executeUpdate();
		 System.out.println(result);
		 entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction .rollback();
		}finally {
			entityManager.close();
		}
	}
}
