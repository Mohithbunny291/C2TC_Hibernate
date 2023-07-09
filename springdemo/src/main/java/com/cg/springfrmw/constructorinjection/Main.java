package com.cg.springfrmw.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new 
						ClassPathXmlApplicationContext("com/cg/springfrmw/constructorinjection/spring.xml");
		
		Person person = (Person) context.getBean("person");
		
		System.out.println(person);
		
		
		Addition addition = (Addition) context.getBean("Add");
		
		addition.sum();
	}

}
