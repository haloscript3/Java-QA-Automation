package com.neotech.review08;

public abstract class Human {
	String name;
	static String planet;

	public Human(String name) {
		this.name = name;
	}

	// Method is declared, but not implemented
	public abstract void talk(); // unimplemented method

	public void sleep() {
		// implemented method, has a method body
		System.out.println("Every human sleeps the same!");
	}

}
