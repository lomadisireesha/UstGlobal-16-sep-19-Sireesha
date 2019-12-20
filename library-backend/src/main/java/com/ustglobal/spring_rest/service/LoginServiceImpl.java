package com.ustglobal.spring_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.spring_rest.dao.LoginUser;
import com.ustglobal.spring_rest.dto.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginUser dao;

	@Override
	public User login(int id, String password) {
		
		
		return dao.login(id, password);
	}


	

}
