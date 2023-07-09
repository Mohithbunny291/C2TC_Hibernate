package com.cg.springfrmw.ref;

public class A {

	private int a;
	private B oB;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B getoB() {
		return oB;
	}
	public void setoB(B oB) {
		this.oB = oB;
	}
	
	@Override
	public String toString() {
		return "A [a=" + a + ", oB=" + oB + "]";
	}
}
