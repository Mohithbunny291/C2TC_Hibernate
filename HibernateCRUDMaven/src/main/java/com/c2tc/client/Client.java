package com.c2tc.client;

import com.c2tc.entities.Employee;
import com.c2tc.util.HibernateUtil;

import java.sql.Date;

import org.hibernate.Session;

public class Client {
    public static void main(String[] args) {

    	Session session = null;
        try{
        	session = HibernateUtil.getSessionFactory().openSession();
        //	createEmployee(session);
        //	getEmployeebyId(session);
        //	updateEmployee(session);
        //	deleteEmployee(session);
        	
        	
        }catch (Exception e){
            e.printStackTrace();
        }finally {
			if (session != null) {
				session.close();
				System.out.println("Session closed");
			}
		}
    }

	private static void deleteEmployee(Session session) {
		

		
		Employee employee = session.get(Employee.class, 1);
		if (employee != null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
		}else {
			System.out.println("Employee not found");
		}
	
	}

	private static void updateEmployee(Session session) {
		
		Employee employee = session.get(Employee.class, 1);
		if (employee != null) {
			//session.beginTransaction();
			employee.setEmail("hariharaharan1@gmail.com");
			session.update(employee);
			session.beginTransaction().commit();
		}else {
			System.out.println("Employee not found");
		}
	}
	
private static void getEmployeebyId(Session session) {
		
		Employee employee = session.get(Employee.class, 2);
		if (employee != null) {
			System.out.println(employee);
		}else {
			System.out.println("Employee not found");
		}
	}

	private static void createEmployee(Session session) {
		Employee employee = getEmployee();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
	}
    
    private static Employee getEmployee() {
		
    	Employee employee = new Employee();
    	employee.setEmployeeName("Ram");
    	employee.setEmail("ramramna@gmail.com");
    	employee.setSalary(12003.00);
    	employee.setDojDate(new Date(0));
    	return employee;
	}
	
}