package com.ustglobal.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvc.dto.Order;
import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.RetailBean;
@Repository
public class RetailerDaoImppl implements RetailerDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public RetailBean login(int id, String password) {
		String jpql = "from RetailBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailBean> query = manager.createQuery(jpql,RetailBean.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailBean bean = query.getSingleResult(); 
		return bean;
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}

	@Override
	public int register(RetailBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	@Override
	public Product search(String pname) {
		EntityManager manager=factory.createEntityManager();
		try {
			Product product=manager.find(Product.class, pname);
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean updatePassword(int id ,String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailBean empbean = manager.find(RetailBean.class, id);
		empbean.setPassword(password);
		transaction.commit();
		
		return true;
	}

	@Override
	public List<Order> getProducts(String email) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			String jpql="from OrderProduct where email=:email";
			TypedQuery<Order> tquery=manager.createQuery(jpql,Order.class);
			tquery.setParameter("email", email);
			List<Order> list=tquery.getResultList();
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean buyProduct(Order orderProduct) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(orderProduct);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
}

