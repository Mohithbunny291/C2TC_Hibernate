package com.cg.springdemoxmlconfig;

import org.springframework.stereotype.Component;

@Component
public class Bike extends Vehicle{

	public void run() {
		System.out.println("Bike Running");
		
	}

}
