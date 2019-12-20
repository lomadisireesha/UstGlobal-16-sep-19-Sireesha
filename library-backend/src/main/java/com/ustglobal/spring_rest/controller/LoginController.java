package com.ustglobal.spring_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.spring_rest.dto.User;
import com.ustglobal.spring_rest.dto.UserResponse;
import com.ustglobal.spring_rest.service.LoginService;


@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
@RestController
public class LoginController {

	@Autowired
	private LoginService service;

	UserResponse response = new UserResponse();

	@PostMapping(path ="/login/{id}/{password}")
	public User login(@PathVariable("id") int id, @PathVariable("password") String password , User users) {
		
		User bean = service.login(id, password);
		

		return bean;
	}
}
