package com.neotech.lesson22;

public class Parent {

	//instance variables 
	String name = "Parent Name";
	String lastName = "Parent LastName";
	
	void hello()
	{
		System.out.println("I am the parent class!!!");
	}
}

class Child extends Parent
{
	
	String name = "Child Name";
	//String lastName = "Child LastName";
	
	void display()
	{
		/*
		  If I had a class Employee and I wanted to access elements on it. 
		  I need to create an object. 
		  Employee emp = new Employee(); 
		  then, every element I would access it using emp.name, emp.lastName
		 
		 */
		System.out.println(name); //this will print Child Name; by default Java puts this. in front of it
		System.out.println(this.name);//this will print Child Name
		
		//what if I want to print the name of the parent??? 
		System.out.println(super.name);
		System.out.println(lastName); //what would this print? inherited last name
		//can I do this.lastName? Yes, but would not have any effect...
		System.out.println(this.lastName);
		//can I do super.lastName? Yes, we are just being more specific
		System.out.println(super.lastName);
		
	}
	
	void hello()
	{
		System.out.println("I am the Child class!!!");
	}

	void sayHello()
	{
		display(); //there is a display() method in this class, so java runs this.display()
		hello(); //if not specified, Java inserts this. in front of the method name
		super.hello();
	}
	
}
