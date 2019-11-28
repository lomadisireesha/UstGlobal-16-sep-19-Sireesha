package com.ust.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.spring.di.Cat;
import com.ust.spring.di.Dog;
import com.ust.spring.di.Pet;
@Configuration
public class PetConfigurationClass {
	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean(name="cat")
	public Cat getCat() {
		return new Cat();
		
	}
	@Bean(name="pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Jacky");
		//pet.setAnimal(getDog());
		return pet;
	}

}
