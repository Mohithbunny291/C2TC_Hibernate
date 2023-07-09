package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Student student = new Student();
//		student.getCheats();
		
		Student s1 = context.getBean("student",Student.class);
		s1.cheating();
		
		
	}

}
