package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.Product;

public class InsertDemo {
public static void main(String[] args) {
	Product productinfo = new Product();
	productinfo.setPid(3);
	productinfo.setPname("Sketch");
	productinfo.setQuantity(3);
	
	EntityManagerFactory entitymanager = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager  entity = entitymanager.createEntityManager();
	EntityTransaction entitytransaction = entity.getTransaction();
	entitytransaction.begin();
	entity.persist(productinfo);
	System.out.println("Record Saved");
	entitytransaction.commit();
	entity.close();
	
	

}
}
