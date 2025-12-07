package com.neotech.review07;

public class Multiplication {

	
	//Method signature: method name + params types 
	//In Java, method signature must be unique within the class 
	//Method Overloading: I have multiple methods with the same name within the same class. 
	
	
	public static void multiply(int num1, int num2)
	{
		int result = num1 * num2; 
		
		System.out.println(result);
	}
	
	public static void multiply(int num1, int num2, int num3)
	{
		int result = num1 * num2 * num3;
		System.out.println(result);
	}
	
	public static void multiply(double d1, double d2)
	{
		double result = d1 * d2;
		System.out.println(result);
	}
	
	//So, how do we achieve overloading: 
	//1. changing the number of the parameters
	//2. changing the type of the parameters
	//3. changing the order of the parameters 
	
	
	//Create another multiply method that accepts an integer array as a parameter and multiplies all numbers 
	//in the array and prints the result 
	
	public static void multiply(int[] numbers)
	{
		int result = 1; 
		
		for (int num : numbers)
		{
			result *= num;
		}
		
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
		
		//compile time polymorphism  a.k.a static binding a.k.a method overloading
		
		multiply(5, 7);
		multiply(4.5, 7); //7 would be casted to 7.0
		Multiplication.multiply(5, 7, 9); //we don't need to use the class name since we are within the same class
		
		int[] array = {3, 6, 7, 9};
		multiply(array);
		
		
	}
	
}
