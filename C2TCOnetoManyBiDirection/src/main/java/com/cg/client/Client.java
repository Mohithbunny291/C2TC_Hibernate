package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Department;
import com.cg.entity.Employee;

public class Client {
    public static void main( String[] args ){
    	
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        Department department1 = new Department();
        department1.setDepartmentId(10001);
        department1.setDepartmentName("R and D");
        
        Department department2 = new Department();
        department2.setDepartmentId(10002);
        department2.setDepartmentName("Tech");
        
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Mohith");
        employee1.setSalary(16000.21);
        
        Employee employee2 = new Employee();
        employee2.setEmployeeName("Rohith");
        employee2.setSalary(26000.21);
        
        Employee employee3 = new Employee();
        employee3.setEmployeeName("Keerthi");
        employee3.setSalary(23200.12);
        
        department1.addEmployee(employee1);
        
        department2.addEmployee(employee2);
        
        department2.addEmployee(employee3);
        
        entityManager.persist(department1);
        entityManager.persist(department2);
        
        System.out.println("Added Employee and Department Details");
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
