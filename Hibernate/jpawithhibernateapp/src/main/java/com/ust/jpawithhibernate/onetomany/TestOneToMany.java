package com.ust.jpawithhibernate.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestOneToMany {
public static void main(String[] args) {
	PencilBox pebox = new PencilBox();
	pebox.setPricebox(11);
	pebox.setBrand("Natraj");
	
	Pencil pencil = new Pencil();
	pencil.setPrice(5);
	pencil.setColor("black");
	pencil.setPencilBox(pebox);
	
	Pencil pencil1 = new Pencil();
	pencil1.setPrice(6);
	pencil1.setColor("red");
	pencil1.setPencilBox(pebox);
	EntityManager  entityManger = null;
	EntityTransaction entitytransaction=null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	entityManger = entityManagerFactory.createEntityManager();
	entitytransaction = entityManger.getTransaction();
	entitytransaction.begin();
	
	entityManger.persist(pencil);
	entityManger.persist(pencil1);
	System.out.println("Record saved");
	entitytransaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		entitytransaction.rollback();
	}
	entityManger.close();
}
}

