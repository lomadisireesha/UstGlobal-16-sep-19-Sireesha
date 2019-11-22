package com.ust.jpawithhibernate.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.jpawithhibernateapp.dto.Product;

public class Retrivejpql {
public static void main(String[] args) {
	EntityManager entityManager = null;
	try {
	 EntityManagerFactory  entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
	 entityManager = entityManagerFactory.createEntityManager();
	   //String jpql = "from Product";
	 String jpql = "select pname from Product";
	   Query query=entityManager.createQuery(jpql);
	   List<String> list =   query.getResultList();
	   for(String String : list) {
		   System.out.println(String);
	   }
	   
	   entityManager.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
