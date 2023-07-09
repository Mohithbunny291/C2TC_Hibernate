package com.cg.C2TCTablePerClassInheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {
		
    public static void main( String[] args ){
    	
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
    	EntityManager manager = factory.createEntityManager();
    	
    	manager.getTransaction().begin();
    	
    	Employee e1 = new Employee();
    	e1.setEmployeeName("Mohith");
    	e1.setSalary(1600000);
    	manager.persist(e1);
    	
    	Manager m1 = new Manager();	
    	m1.setEmployeeName("Rohith");
    	m1.setDepartmentName("R AND D");
    	m1.setSalary(10000000);
    	manager.persist(m1);
    	
    	manager.getTransaction().commit();
    	
    	manager.close();
    }
}
