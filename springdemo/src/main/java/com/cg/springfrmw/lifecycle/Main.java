package com.cg.springfrmw.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/cg/springfrmw/lifecycle/spring.xml");
		
		((AbstractApplicationContext) context).registerShutdownHook(); //where as this anywhere.
		
		Student student = (Student) context.getBean("s1");
		System.out.println(student);
				
		
		Teacher teacher = (Teacher) context.getBean("t1");
		System.out.println(teacher);
		
		Session session = (Session) context.getBean("c1");
		System.out.println(session);
		
		
		
		// ((AbstractApplicationContext) context).close(); this we have to specify at last.
		
	}

}
