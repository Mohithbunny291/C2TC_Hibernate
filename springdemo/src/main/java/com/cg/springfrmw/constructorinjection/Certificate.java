package com.cg.springfrmw.constructorinjection;

public class Certificate {

	private String nameString;

	public Certificate(String nameString) {
		super();
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		
		return this.nameString;
	}

}
