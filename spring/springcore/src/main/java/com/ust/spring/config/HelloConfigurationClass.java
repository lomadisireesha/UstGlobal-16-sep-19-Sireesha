package com.ust.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.ust.spring.di.Hello;
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {
	@Bean(name="hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello = new Hello();
		hello.setMsg("I love Java");
		return  hello;
	}
}
