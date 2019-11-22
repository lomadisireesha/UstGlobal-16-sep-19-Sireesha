package com.ust.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("TestPersistenc");
		EntityManager  entitymanager = entitymanagerfactory.createEntityManager();
		Product productdetail = entitymanager.find(Product.class, 1);
		System.out.println("Name: " +productdetail.getPname());
		System.out.println("Id: " +productdetail.getPid());
		System.out.println("Quantity: " +productdetail.getQuantity());
		entitymanager.close();
	}
}
