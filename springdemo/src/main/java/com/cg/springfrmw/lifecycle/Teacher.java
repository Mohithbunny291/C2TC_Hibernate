package com.cg.springfrmw.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean{

	private String nameString;
	
	public Teacher() {
		
	}

	public Teacher(String nameString) {
		super();
		this.nameString = nameString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Teacher [nameString=" + nameString + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("teacher class Init");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Teacher class end");
	}
	
	
}
