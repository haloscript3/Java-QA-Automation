package com.neotech.review07_polymorphism;

public class Human {
	
	String name; //instance variable
	static String planet; //class variable 

	
	public Human()
	{
		//super();
		System.out.println("A human object is being created....");
	}
	
	
	public Human(String name)
	{
		this();
		this.name = name;
	}
	
	//behavior
	public void talk()
	{
		System.out.println("Say something...");
	}
	
}
