package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.passport.Passport;
import com.cg.person.Person;

public class Client {
    public static void main( String[] args ){
    	
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Person person1 = new Person();
        person1.setName("Mohith");
        
        Passport passport = new Passport();
        passport.setId(1001);
        passport.setPassportCountry("india");
        
        person1.setPassport(passport);
        
        
        entityManager.persist(person1);
        entityManager.persist(passport);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
