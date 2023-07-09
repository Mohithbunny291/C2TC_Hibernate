package com.cg.client;

import com.cg.util.HibernateUtil;



import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

public class Client {
    public static void main(String[] args) {

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
        	
        	String SQL = "select version()";
        	NativeQuery<?> nativeQuery = session.createSQLQuery(SQL);
        	Object object = nativeQuery.getSingleResult();
        	String string = (String)object;
        	//String result = (String)session.createNativeQuery(SQL).getSingleResult();
           	System.out.println(string);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}