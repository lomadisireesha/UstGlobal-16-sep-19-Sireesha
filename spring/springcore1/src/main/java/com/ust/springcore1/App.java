package com.ust.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.di.Book;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
    	Book book1 = context.getBean(Book.class);
    	System.out.println(book1.getAuthor());
    	
    	System.out.println(book1.getName());
    }
}
