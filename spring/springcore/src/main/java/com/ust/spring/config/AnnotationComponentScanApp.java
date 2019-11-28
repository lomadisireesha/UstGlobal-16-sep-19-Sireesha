package com.ust.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.spring.di.Hello;
import com.ust.spring.di.Pet;

public class AnnotationComponentScanApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class	);
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Lavi");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Rakhie");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}
}
