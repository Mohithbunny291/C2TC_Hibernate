package com.cg.client;

import javax.persistence.EntityManager;

import com.cg.entities.Customer;
import com.cg.util.JPAUtil;

public class App {
	
	private static EntityManager entityManager = JPAUtil.getEntityManager();
	
    public static void main( String[] args ){
    	
    	 addCustomer("Mohith","Elluru");
    }

	private static void addCustomer(String fname,String lname) {
		
		entityManager.getTransaction().begin();
		Customer customer = new Customer();
		customer.setFirstName(fname);
		customer.setLastName(lname);
		entityManager.getTransaction().commit();
	}
}
