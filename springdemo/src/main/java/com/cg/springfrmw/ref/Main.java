package com.cg.springfrmw.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/cg/springfrmw/ref/spring.xml");
		
		A a = (A) context.getBean("aref");
		
		System.out.println(a);
	}

}
