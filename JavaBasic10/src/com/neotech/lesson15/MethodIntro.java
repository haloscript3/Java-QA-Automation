package com.neotech.lesson15;

public class MethodIntro {

	// lets create the greet() method

	void greet() { // method header
		// method body
		System.out.println("Hello");
		System.out.println("How are you doing?");
		System.out.println("Bye");
	}

	public static void main(String[] args) {

		MethodIntro obj = new MethodIntro();

		System.out.println("I am in the main method");

		System.out.println("Now I will go into the greet() method!");

		obj.greet();

	}


}
