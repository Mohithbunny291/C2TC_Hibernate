package com.cg.client;

import com.cg.entities.Employee;
import com.cg.util.HibernateUtil;

import java.sql.Date;

import org.hibernate.Session;

public class Client {
    public static void main(String[] args) {

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
        	
        	Employee employee = getEmployee();
        	session.beginTransaction();
        	session.persist(employee);
        	session.getTransaction().commit();
        	
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private static Employee getEmployee() {
		
    	Employee employee = new Employee();
    	employee.setEmployeeName("Tarzan");
    	employee.setEmail("Tar@gmail.com");
    	employee.setSalary(100000.00);
    	employee.setDojDate(new Date(0));
    	return employee;
	}
}