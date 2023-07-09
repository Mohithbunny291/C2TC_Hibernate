package com.cg.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static StandardServiceRegistry standardServiceRegistry; //to initialize Hibernate
    private static SessionFactory sessionFactory; 

    //As SessionFactory is expensive we use in a static block and the object is created only once and at the biggining of the main.
    static {
        try {
            if(sessionFactory == null){ //if sessionFactory is null
            	
            	// create standardServiceRegistry
                standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
                
                // create MetadataSources 
                MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
                
                // create Metadata
                Metadata metadata = metadataSources.getMetadataBuilder().build();
                
                // create sessionFactory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if(standardServiceRegistry != null){
                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            }
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
