package com.cg.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //it will print if @primary is specified or else mediatek
public class Snapdragon implements MobileProcessor{
	
	public void processor() {
		
		System.out.println("CPU 4GHz");
	}
}
