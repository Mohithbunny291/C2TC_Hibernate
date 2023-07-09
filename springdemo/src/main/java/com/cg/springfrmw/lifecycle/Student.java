package com.cg.springfrmw.lifecycle;

public class Student {

	private String nameString;
	
	private double id;
	
	
	public Student() {
		super();
	}
	
	public Student(String nameString, double id) {
		super();
		this.nameString = nameString;
		this.id = id;
	}
		

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		System.out.println("Setting Name");
		this.nameString = nameString;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		System.out.println("Setting Id");
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", id=" + id + "]";
	}
	
	public void init() {
		
		System.out.println("Init");
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
}
