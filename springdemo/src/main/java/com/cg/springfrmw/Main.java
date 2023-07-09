package com.cg.springfrmw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/springfrmw/config.xml");
		
		Student studentr = (Student) context.getBean("student");
		System.out.println(studentr);
		
		Student student = (Student) context.getBean("student1");
		System.out.println(student);
		
		Student student2 = context.getBean("student2",Student.class);
		System.out.println(student2);
		
		Student student3 = context.getBean("student3",Student.class);
		System.out.println(student3);
	}

}
