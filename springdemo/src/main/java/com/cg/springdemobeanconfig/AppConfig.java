package com.cg.springdemobeanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cg.springdemo.Mediatek;
import com.cg.springdemo.MobileProcessor;

@Configuration
@ComponentScan(basePackages = "com.cg")
public class AppConfig {
//
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public Snapdragon getCPU() {
//		return new Snapdragon();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon2();
//	}
}
