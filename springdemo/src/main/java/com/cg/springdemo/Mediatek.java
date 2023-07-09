package com.cg.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //or this 
public class Mediatek implements MobileProcessor{

	@Override
	public void processor() {
		
		System.out.println("Best CPU");
	}

}
