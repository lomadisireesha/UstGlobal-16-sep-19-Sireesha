package com.ustglobal.spring_rest.service;

import java.util.List;

import com.ustglobal.spring_rest.dto.User;

public interface AdminService {


	public boolean addUser(User user);

	public List<User> displayUsers();
	
	public boolean deleteUSer(int lid) ;
	
	





}
