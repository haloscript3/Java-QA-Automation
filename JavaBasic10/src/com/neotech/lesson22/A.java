package com.neotech.lesson22;

public class A {

	/*  Write program for multilevel inheritance where class A 
	    is inherited by B and class B is inherited by class by C.
	*/
	
	String name = "A";
	String lastName = "Test";
	
	
	void method()
	{
		System.out.println("This is a method in class A!!!");
		System.out.println(name);
		//Could I say this.name?
		System.out.println(this.name);
//		System.out.println(super.name); // we are trying to get a name parameter from the Object class
	}
}

class B extends A
{
	String name = "B";
	
	void method()
	{
		System.out.println("This is a method in class B!!!");
		System.out.println(name); //which name does this print? this.name, B name
		System.out.println(super.name); // super (A) name
		super.method(); //which method?? method from A
	}
	
	
}

class C extends B
{
	String name = "C";
	
	void method()
	{
		System.out.println("This is a method in class C!!!");
		System.out.println(name); //which name?  C name (same as this.name)
		System.out.println(super.name); //which name? B name
		super.method(); //which method? B.method
		
		System.out.println(lastName);//where is this coming from? A
	}
}