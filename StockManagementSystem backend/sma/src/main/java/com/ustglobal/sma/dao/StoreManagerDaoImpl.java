package com.ustglobal.sma.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.sma.dto.OrderInfo;
import com.ustglobal.sma.dto.Products;

@Repository
public class StoreManagerDaoImpl implements StoreManagerDAO {


	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Products products) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(products);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public Products getProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Products.class, id);
	}

	@Override
	public Products getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products where Pname=:Pname";
			TypedQuery<Products> typedQuery = manager.createQuery(jpql, Products.class);
			typedQuery.setParameter("Pname", name);
			Products product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Products> getProductByCatagory(String catagory) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products where category=:category";
		TypedQuery<Products> typedQuery = manager.createQuery(jpql, Products.class);
		typedQuery.setParameter("category", catagory);
		return typedQuery.getResultList();
	}

	@Override
	public List<Products> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products";
		TypedQuery<Products> typedQuery = manager.createQuery(jpql, Products.class);
		return typedQuery.getResultList();

	}

	
	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products product = manager.find(Products.class, id);
			manager.remove(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean addToCart(OrderInfo orders) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
	
			Products p = new Products();
			orders.setId(p.getPid());
			orders.setTotalPrice(p.getPrice());
			orders.setPriceWithGST(p.getPrice()+45);
			manager.persist(orders);
			
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	
	}

}
