package com.neotech.lesson23;

public class Parent {

	Parent() {
		System.out.println("Parent default constructor");
	}

	private void hello() {
		System.out.println("Hello from parent class");
	}

	static void bye() {
		System.out.println("Bye from parent class");
	}
}

class Child extends Parent {

	public Child() {
		System.out.println("Child defoult constructor");
	}

	// If i can not access the method, I can not override it
	// this is a new method that only belongs to the Child class
	// and it is NOT an override of the parent hello()
	private void hello() {
		System.out.println("Hello from child class");
	}

	// static method can not be overridden
	// so this is called re-declaration
	static void bye() {
		System.out.println("Bye from child class");
	}

}
