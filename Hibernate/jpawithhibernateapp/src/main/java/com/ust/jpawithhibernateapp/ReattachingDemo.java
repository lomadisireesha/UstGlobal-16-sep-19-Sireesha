package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {
	public static void main(String[] args) {
		EntityManager  entityManger = null;
		EntityTransaction entitytransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManger = entityManagerFactory.createEntityManager();
    	entitytransaction = entityManger.getTransaction();
		entitytransaction.begin();
		Product productInfo = entityManger.find(Product.class,1);
		System.out.println(entityManger.contains(productInfo));
		entityManger.detach(productInfo);
		System.out.println(entityManger.contains(productInfo));
		Product productInfo2 =entityManger.merge(productInfo);
		productInfo2.setPname("mobile");
		System.out.println("Record Updated");
		entitytransaction.commit();
	
		}catch(Exception e) {
			e.printStackTrace();
			entitytransaction.rollback();
		}
		entityManger.close();
		
	}
	}


