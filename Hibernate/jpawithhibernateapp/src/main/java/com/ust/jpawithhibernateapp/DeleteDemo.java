package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.Product;

public class DeleteDemo {
public static void main(String[] args) {
	EntityManager  entityManger = null;
	EntityTransaction entitytransaction=null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManger = entityManagerFactory.createEntityManager();
	 entitytransaction = entityManger.getTransaction();
	entitytransaction.begin();
	Product productInfo = entityManger.find(Product.class,10);
	entityManger.remove(productInfo);
	System.out.println("Record Deleted");
	entitytransaction.commit();
	
	}catch(Exception e) {
		e.printStackTrace();
		entitytransaction.rollback();
	}
	entityManger.close();
	

}
}
