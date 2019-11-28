package com.ust.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.spring.config.ConfigurationClass;
import com.ust.spring.di.Animal;
import com.ust.spring.di.Hello;
import com.ust.spring.di.Pet;

public class AnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		Hello hello=context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		Hello hello1=context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello1);
		System.out.println("***************************");
		
		/*Animal animal = context.getBean(Animal.class);
		animal.makeSound();*/
		
		System.out.println("*************************");
		
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
	}
	
	
}
