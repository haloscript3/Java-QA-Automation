package com.neotech.review08_final;

public class Person {
	String name;
	final String id;

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void displayInfo() {
		System.out.println("ID: " + id + " Name: " + name);
	}

	public final void sayHello() {
		System.out.println("Hello " + name);
	}

}
