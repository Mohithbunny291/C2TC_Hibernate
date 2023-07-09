package com.cg.springfrmw.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Session {
	
	private String subjectString;
	
	public Session() {
		// TODO Auto-generated constructor stub
	}

	public Session(String subjectString) {
		super();
		this.subjectString = subjectString;
	}

	public String getSubjectString() {
		return subjectString;
	}

	public void setSubjectString(String subjectString) {
		this.subjectString = subjectString;
	}

	@Override
	public String toString() {
		return "Class [subjectString=" + subjectString + "]";
	}
	
	@PostConstruct
	public void intit() {
		
		System.out.println("Class init");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("Class destroy");		
	}
}
