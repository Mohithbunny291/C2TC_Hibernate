package com.cg.springfrmw.constructorinjection;

public class Addition {

	private int a;
	private int b;
	
	Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int values");
	}
	Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double values");
	}
//	Addition(String a, String b) {
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		System.out.println("String values");
//	}
	
	public void sum() {
		System.out.println("a: "+a+" b: "+b);
		System.out.println("Sum is: "+(this.a+this.b));
	}
}
