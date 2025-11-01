package com.neotech.lesson22;

public class Addition {

	
	// add(int, int)
	void add(int a, int b)
	{
		System.out.println(a + b);
	}
	
	
	// add(int, int, int)
	void add(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}
	
	
	//add(double, double)
	void add(double a, double b)
	{
		System.out.println(a + b);
	}
	
	//looking at the methods above, we see that it is allowed to have methods 
	//with the same name, but different signature (# of params, type of params, order of params)
	
	//this is known as Method Overloading 
	
	
	//so based on that, would these work: 
	
	//add(double, int)
	void add(double a, int b)
	{ 
		System.out.println(a + b);
	}
	
	//add(double, double, double)
	void add(double a, double b, double c)
	{
		System.out.println(a + b + c);
	}
	
	//add(String, int) 
	void add(String str, int i)
	{
		System.out.println("Cannot add String and int!!!");
	}
	//add(int, String)
	void add(int i, String str)
	{
		System.out.println("Cannot add String and int!!!");
	}
	
	
}
