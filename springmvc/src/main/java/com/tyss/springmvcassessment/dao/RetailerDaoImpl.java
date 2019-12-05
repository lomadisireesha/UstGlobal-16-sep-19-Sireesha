package com.tyss.springmvcassessment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.springmvcassessment.dto.OrderBean;
import com.tyss.springmvcassessment.dto.Product;
import com.tyss.springmvcassessment.dto.RetailerBean;

@Repository
public class RetailerDaoImpl implements RetailerDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public int createProfile(RetailerBean bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}
	
	@Override
	public List<OrderBean> getOrders(int pid) {
		String jpql = "from OrderBean where retailerid=:pid";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<OrderBean> query = manager.createQuery(jpql,OrderBean.class);
		query.setParameter("pid", pid);
		try {
		List<OrderBean> list = query.getResultList();
		 return list;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from RetailerBean where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
		RetailerBean bean = query.getSingleResult();
		return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	@Override
	public Product search(int pid) {
		EntityManager manager = factory.createEntityManager();
		Product product = manager.find(Product.class,pid);
		
		return product;
		
	}
	
	@Override
	public double totalAmount(int id) {
		String jpql = "from OrderBean where retailerid=:pid";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<OrderBean> query = manager.createQuery(jpql,OrderBean.class);
		query.setParameter("pid", id);
		try {
		List<OrderBean> list = query.getResultList();
		double totalAmount = 0.0;

			for(OrderBean order:list) {
				totalAmount+=order.getAmountpayable();
			}
			return totalAmount;
	
		 
		}catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
		
	}
	
	@Override
	public boolean updatePassword(int id,String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean bean  = manager.find(RetailerBean.class,id);
		
		bean.setPassword(password);
		
		transaction.commit();
		return true;
	}
	
	@Override
	public boolean doOrder(int pid,int quantity,int retailerid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			String jpql = "from Product where pid=:id";
			TypedQuery<Product> query = manager.createQuery(jpql,Product.class);
			query.setParameter("id", pid);
			Product product = query.getSingleResult();
			
			OrderBean order = new OrderBean();

			
			order.setProductname(product.getPname());
			order.setPriceperunit(product.getPriceperproduct());
			order.setQuantity(quantity);
			order.setAmountpayable(quantity*product.getPriceperproduct());
			order.setRetailerid(retailerid);
			

			order.setProduct(product);
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}finally {
			manager.close();
		}
		
		
	}

}
