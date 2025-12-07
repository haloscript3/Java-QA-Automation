package com.neotech.lesson31;

public class Person {
	
	public String firstName, lastName;
	private int age, salary;
	
	
	public Person(String firstName, String lastName, int age, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	
	void printDetails()
	{
		System.out.println(firstName + " " + lastName + " " + age + " " + salary);
	}



	
}
