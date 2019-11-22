package com.ust.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.jpawithhibernate.onetoone.VoterCard;

public class TestManyToMany {
	public static void main(String[] args) {
		Course course = new Course();
		course.setCid(22);
		course.setCname("Siri");
		
		Course course1 = new Course();
		course1.setCid(21);
		course1.setCname("Hari");
		
		ArrayList<Course> alcourse = new ArrayList<Course>();
		alcourse.add(course);
		alcourse.add(course1);
		
		Student student = new Student();
		student.setSid(7);
		student.setSname("Lavi");
		student.setCourse(alcourse);
		
		Student student1 = new Student();
		student1.setSid(8);
		student1.setSname("Lucky");
		student.setCourse(alcourse);
		
		
		EntityManager  entityManger = null;
		EntityTransaction entitytransaction=null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManger = entityManagerFactory.createEntityManager();
    	entitytransaction = entityManger.getTransaction();
		entitytransaction.begin();
		System.out.println("Record saved");
		entityManger.persist(student);
		entityManger.persist(student1);
		entitytransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entitytransaction.rollback();
		}
		entityManger.close();

	}
}
