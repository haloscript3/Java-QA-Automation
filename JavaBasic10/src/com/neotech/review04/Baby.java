package com.neotech.review04;

public class Baby {

	// variables/attributes/properties
	String name;
	char gender;
	int weight;
	String hairColor;

	// methods/behaviors/actions
	void talk() {
		System.out.println(name + " is talking");
	}

	void drink() {
		System.out.println(name + " is drinking");
	}

	void cry() {
		System.out.println(name + " is crying");
	}

	void displayInformation() {
		System.out.println("My name is " + name);
		System.out.println("My gender is " + gender);
		System.out.println("My hair color is " + hairColor);
	}

}
