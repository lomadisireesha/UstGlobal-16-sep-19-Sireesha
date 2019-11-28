package com.ust.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.spring.di.Hello;

public class LifeCycle {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		context.close();
	}
}
