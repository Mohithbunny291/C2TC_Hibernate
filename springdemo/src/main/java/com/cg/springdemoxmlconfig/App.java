package com.cg.springdemoxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
    public static void main( String[] args )
    {
       
    	Vehicle objVehicle = (Vehicle) context.getBean("bike");
//    	
//    	objVehicle.run();
    	
    	//Car car = (Car) context.getBean("car");
		objVehicle.run();
    	
//    	Tyre objTyre = (Tyre) context.getBean("tyre");
//    	System.out.println(objTyre);
    }
}
