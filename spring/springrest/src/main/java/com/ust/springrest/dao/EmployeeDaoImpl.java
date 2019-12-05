package com.ust.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.springrest.dto.EmployeeBean;
@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
	@PersistenceUnit
 	private EntityManagerFactory factory;
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeebean = manager.find(EmployeeBean.class,bean.getId());
		employeebean.setName(bean.getName());
		employeebean.setGender(bean.getGender());
		employeebean.setPassword(bean.getPassword());
		employeebean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeebean = manager.find(EmployeeBean.class , id);
		manager.remove(employeebean);
		if(employeebean!=null) {
			manager.remove(employeebean);
			transaction.commit();
			return true;
		}else {
		return false;
		}
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeeBean employeebean = manager.find(EmployeeBean.class , id);
		return employeebean;
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		String jpql = "from EmployeeBean ";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql , EmployeeBean.class);
		List<EmployeeBean> employeeBeans = query.getResultList();
		return employeeBeans;
	}

}
