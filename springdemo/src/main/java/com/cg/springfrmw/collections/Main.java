package com.cg.springfrmw.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/springfrmw/collections/config.xml");
		
		Employee employee = (Employee) context.getBean("employee1");
		
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeePhoneList());
		System.out.println(employee.getEmployeeAddressSet());
		System.out.println(employee.getCoursesMap());
		System.out.println(employee.getProps());
		
		
	}

}
