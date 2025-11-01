package com.neotech.lesson20;

public class ThisKeyword {
	int a, b;

	// default constructor
	ThisKeyword() {

	}

	// second constructor
	ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// method
	void sum(int a, int b) {
		System.out.println("sum of local variables: " + (a + b));
		System.out.println("sum of instance variables: " + (this.a + this.b));

		// when we have the same name for local and instance variables:
		// use this keyword to distinguish between the local and instance variables
		// for local variables -> no keyword
		// for instance variables -> this keyword (this.variableName)
	}
}
