package com.neotech.review07_polymorphism;

public class MethodOverloading {

	
	public void calculateInterest()
	{
		
	}
	
	public void calculateInterest(int a)
	{
		
	}
	
	public void calculateInterest(String a)
	{
		
	}
	
	public void calculateInterest(int a, int b)
	{

	}
	
	public void calculateInterest(int a, double b)
	{

	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading(); 
		
		//Polymorphism - many forms 
			// Method overloading - compile time polymorphism - static/early binding 
		
		mo.calculateInterest("John");  
		mo.calculateInterest(4, 4.5);
		
	}
	
}
