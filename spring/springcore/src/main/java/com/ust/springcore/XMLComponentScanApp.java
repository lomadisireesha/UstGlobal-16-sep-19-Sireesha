package com.ust.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.spring.di.Hello;
import com.ust.spring.di.Pet;

public class XMLComponentScanApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Lucky");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("jacky");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}
}
