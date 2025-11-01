package com.neotech.lesson19;

public class Employee {

	//Access modifiers: public, protected, default, private 
	
	//	OPTIONAL		  	MUST			MUST			OPTIONAL
	//access modifier    data type     identifier     assignment op    value;
	
	public static String company;
	public String name;
	protected String lastName;
	double salary;  //if there is no access modifier, then its default
	private int ssn;
	
	//Formula: 
	//		OPTIONAL			MUST			MUST
		// access modifier    returnType    methodName()
	
	public void method1()
	{
		System.out.println("I am a public method!!!");
	}
	
	
	
	
	protected void method2()
	{
		System.out.println("I am a protected method!!!");
	}
	
	
	
	void method3()
	{
		System.out.println("I am a default method!!!");
	}
	
	private void method4()
	{
		System.out.println("I am a private method!!!");
	}
	
	public static void main(String[] args) {
		// I want to create an object of the Employee class
		// and try to access its elements from here. 
		
		company = "NeoTech"; //within the same class, did not need the ClassName
		
		Employee emp = new Employee();
		emp.name = "John";
		emp.lastName = "Doe";
		emp.salary = 55.5;
		emp.ssn = 12345;
		
		//Within the same class, we can access all types of elements 
		// public, protected, default or private
		
		//Lets check the access to methods: 
		
		emp.method1(); //within the same class, I can access the public method
		emp.method2(); // "	" 				"  			" 		protected method
		emp.method3(); // ""            -           ""			default method
		emp.method4(); // "" 					-			"   private method
		
		
	}
	
	
}
