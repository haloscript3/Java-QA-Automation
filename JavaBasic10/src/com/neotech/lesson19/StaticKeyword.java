package com.neotech.lesson19;

public class StaticKeyword {

	//A class of iphones 
	
	//Instance variable
	String color;
	int memory;
	
	//because this class is for iphones, for all of them the brand will be Apple
	//for all of the touchsreen will be true!!!!
	static String brand; 
	static boolean touchscreen;
	
	//If I end up creating 10k objects of this class: 
	// 1. we will have 10k copies of the instance variables 
	// 2. we will have just 1 shared copy of the static variables 
	
	//This is an instance method
	//Inside the instance method, I can use static and non-static elements
	void displaySpecificInfo()
	{
		System.out.println("We build an " + brand + " with " 
	+ memory + "GB and it is " + color);
		
	}
	
	//This is a static method
	//we cannot reference instance variables in a static method
	static void displaySpecificInfo_2()
	{
//		System.out.println("We build an " + brand + " with " 
//	+ memory + "GB and it is " + color);
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);
	}
	
	
	
}
