package com.ust.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernateapp.dto.Product;

public class TestOneToOne {
	
	
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(11);
		vc.setVname("Siri");
		Person p = new Person();
		p.setPid(2);
		p.setPname("Siri");
		p.setVoterCard(vc);
	
		EntityManager  entityManger = null;
		EntityTransaction entitytransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManger = entityManagerFactory.createEntityManager();
    	entitytransaction = entityManger.getTransaction();
		entitytransaction.begin();
		VoterCard vCard = entityManger.find(VoterCard.class, 11);
		System.out.println(vCard.getPerson().getPid()); 
		System.out.println("Record saved");
		//entityManger.persist(p);
		entitytransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entitytransaction.rollback();
		}
		entityManger.close();
}
}
