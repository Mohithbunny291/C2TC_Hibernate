package com.cg.di;

public class Student {

	private Cheats chit;
	
	
	public Cheats getChit() {
		return chit;
	}


	public void setChit(Cheats chit) {
		this.chit = chit;
	}

	public void cheating() {
		chit.mathChit();
	}
}
