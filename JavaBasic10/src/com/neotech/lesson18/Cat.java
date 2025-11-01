package com.neotech.lesson18;

public class Cat {
	// instance variables
	String name;
	int weight;
	String color;

	// static variables
	static boolean isIndependent = true;

	// methods/behaviors/functions
	void sayMeow() {
		System.out.println("meowww");
	}

	void displayInfo() {
		System.out.println(name + " " + weight + " " + color + " " + isIndependent);
	}
}
