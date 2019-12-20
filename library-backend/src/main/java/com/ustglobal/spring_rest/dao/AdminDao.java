package com.ustglobal.spring_rest.dao;

import java.util.List;

import com.ustglobal.spring_rest.dto.User;

public interface AdminDao {
	

	
	public boolean addUser(User user);
	
	public List<User> diplayUsers();
	
	public boolean deleteUser(int lid) ;
	
	
	
	

}
