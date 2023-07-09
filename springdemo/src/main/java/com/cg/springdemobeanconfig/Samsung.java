package com.cg.springdemobeanconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cg.springdemo.MobileProcessor;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediatek") // or @Qualifier("snapdragon")
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		
		System.out.println("Octa Core 4GB Ram");
		
		cpu.processor();
	}
}
