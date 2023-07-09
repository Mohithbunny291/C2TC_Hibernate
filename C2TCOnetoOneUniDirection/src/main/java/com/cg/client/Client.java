package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.address.Address;
import com.cg.student.Student;

public class Client {
    public static void main( String[] args ){
    	
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Student s1 = new Student();
        
        s1.setStudentName("Rohith");
        
        Address a1 = new Address();
        
        a1.setAddressId(1002);
        a1.setStreet("Ram Nagar");
        a1.setCity("Anantapur");
        a1.setState("Andhra Predesh");
        a1.setZipcode(515001);
        
        s1.setAddressId(a1);
        
        entityManager.persist(s1);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
