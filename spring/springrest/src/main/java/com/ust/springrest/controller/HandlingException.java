package com.ust.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ust.springrest.dto.EmployeeResponse;

@RestControllerAdvice
public class HandlingException {
	@ExceptionHandler(Exception.class)
	public  EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatuscode(501);
		response.setMsg("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
}
