package com.neotech.lesson26;

public class Employee {
	private String name;
	private int age;
	private double salary;

	// getter for name property
	public String getName() {
		return this.name;
	}

	// setter for name property
	public void setName(String name) {
		// lets customize the setter
		if (!name.isEmpty() && name.length() > 2) {
			this.name = name;
		}
	}

	// getter for age property
	public int getAge() {
		return this.age;
	}

	// setter for age property
	public void setAge(int age) {
		this.age = age;
	}

	// getter for salary
	public double getSalary() {
		return this.salary;
	}

	// setter for the salary property
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
