package com.neotech.lesson24;

public class Student {
	/*
	 * ▪ Create a class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent. 
	 * ▪ Define common behavior within the parent class and override some of the methods in the child classes 
	 * ▪ Define some methods specific to the child classes 
	 * ▪ Write an example of achieving run time polymorphism
	 */

	protected void study() {
		System.out.println("Student is studying");
	}

	public void doHomework() {
		System.out.println("Student is doing hw!");
	}
}

class NeotechStudent extends Student {
	@Override
	public void study() {
		System.out.println("NeoTech Student is studying");
	}

	// override
	public void doHomework() {
		System.out.println("NeoTech Student is doing hw!");
	}

	public void getJob() {
		System.out.println("NeoTech student gets a QA job!");
	}
}

class CollegeStudent extends Student {
	@Override
	protected void study() {
		System.out.println("College Student is studying");
	}
}

class SchoolStudent extends Student {
	@Override
	protected void study() {
		System.out.println("School Student is studying");
	}
}
