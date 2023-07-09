package com.cg.springdemobeanconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Samsung samsung = context.getBean(Samsung.class);
		samsung.config();  // Change primary in Snapdragon or mediatek or else @qulifier("med or snap") in samsung
		
//		Snapdragon snapdragon = context.getBean(Snapdragon.class);
//		snapdragon.cpu();
	}

}
