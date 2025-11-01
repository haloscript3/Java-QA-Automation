package com.neotech.lesson20;

public class ConstructorTypes {

	String name;
	int age;

	// default constructor
	ConstructorTypes() {
		System.out.println("I am the default constructor!");
	}

	// signature: String
	ConstructorTypes(String str) {
		System.out.println("I am the constructor with one string: " + str);
	}

	// signature: int
	ConstructorTypes(int num) {
		System.out.println("I am the constructor with an integer: " + num);
	}

	// signature: double
	ConstructorTypes(double num) {
		System.out.println("I am the constructor with a double: " + num);
	}

	// signature: String ,int
	ConstructorTypes(String str, int num) {
		System.out.println("I am the constructor with a string and an integer: " + str + " " + num);
	}

	public static void main(String[] args) {

		// lets create several objects using different constructors
		ConstructorTypes obj1 = new ConstructorTypes();

		ConstructorTypes obj2 = new ConstructorTypes("Hello");

		ConstructorTypes obc3 = new ConstructorTypes(6);

		ConstructorTypes obj4 = new ConstructorTypes(4.5);

		ConstructorTypes obj5 = new ConstructorTypes("Achraf", 100);

		// wont work because there is no matching constructor method!
		// ConstructorTypes obj6 = new ConstructorTypes(100, "Achraf");

	}

}
