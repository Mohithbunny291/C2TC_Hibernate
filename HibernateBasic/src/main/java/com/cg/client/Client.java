package com.cg.client;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;

import com.cg.entities.Employees;
import com.cg.util.HibernateUtil;

public class Client {
	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			//createEmployeeInDB(session);
			int id = 3;
			readEmployeeById(session, id);
		}catch (Exception e) {

			e.printStackTrace();
		}
	}

	private static void readEmployeeById(Session session, int id) {

		Employees employees = session.get(Employees.class, id);
		System.out.println(employees);
	}

	private static void createEmployeeInDB(Session session) {
		Employees employees = getEmployee();
		
		session.beginTransaction();
		
		Serializable serializable = session.save(employees);
		Integer id = (Integer)serializable;
			
		session.getTransaction().commit();
		
		System.out.println("Employee with id Number "+id+" created");
	}

	private static Employees getEmployee() {
		
		Employees employees = new Employees();
		employees.setEmployeeName("Teena");
		employees.setEmail("teenaten@gmail.com");
		employees.setDoj(new Date());
		employees.setSalary(1000000);
		return employees ;
	}
	
	
}
