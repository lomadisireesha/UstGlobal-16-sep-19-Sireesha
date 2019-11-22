package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.Product;

public class GetReferenceMethod {
	public static void main(String[] args) {
	EntityManager  entityManger = null;
	EntityTransaction entitytransaction = null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManger = entityManagerFactory.createEntityManager();
	 entitytransaction = entityManger.getTransaction();
	entitytransaction.begin();
	//Product productInfo = entityManger.getReference(Product.class,1);
	Product productInfo = entityManger.find(Product.class,1);
	System.out.println(productInfo.getClass());
//	System.out.println(productInfo.getPname());  
	
//	System.out.println(productInfo.getQuantity());
	entityManger.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

