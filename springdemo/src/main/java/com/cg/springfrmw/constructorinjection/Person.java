package com.cg.springfrmw.constructorinjection;

import java.util.List;

public class Person {

	private String nameString;
	private int personId;
	private Certificate certificate;
	private List<String> list;
	
	public Person(String nameString, int personId, Certificate certificate, List<String> list) {
		super();
		this.nameString = nameString;
		this.personId = personId;
		this.certificate = certificate;
		this.list = list;
	}

	@Override
	public String toString() {
		
		return this.nameString+" : "+ this.personId+" { "+this.certificate+" } "+ this.list;
	}

}
