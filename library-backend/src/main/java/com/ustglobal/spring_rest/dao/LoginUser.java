package com.ustglobal.spring_rest.dao;

import com.ustglobal.spring_rest.dto.User;

public interface LoginUser {
	
	public User login(int id, String  password);

}
