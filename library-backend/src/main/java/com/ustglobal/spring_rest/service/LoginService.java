package com.ustglobal.spring_rest.service;

import com.ustglobal.spring_rest.dto.User;

public interface LoginService {
	
	public User login(int id, String password);

}
