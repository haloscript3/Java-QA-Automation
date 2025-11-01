package com.neotech.lesson19;

public class Task2 {

	/*
	Create a method that will take a String as a parameter and returns 
	the reversed String. Method should be available to all classes 
	within your project and accessible by class name.
  	Call this method from inside the same class and from a class in 
  	another package.
	 */

	
	//Method details: 
		// return type: String
		// param(s): String
		// access: 	available to all classes within the project --> public
		// accessible by className: static
		// name: reverse
	
	public static String reverse(String str)
	{
		//the process: 
		// I can create an empty String, and then add each character 
		// from the end of the input string
		
		String reversed = "";
		
		for (int i = str.length()-1; i >= 0; i--)
		{
			reversed += str.charAt(i);
		}
		
		return reversed;
	}
	
	//with the reverse() method above, this is the proces: 
	// Iteration 1: reversed = T  (new String)
	// Iteration 2: reversed = hT (new String)
	//	.....	 3: reversed = uhT (new String)
	//so, this method creates a lot of clutter, so not the best way
	
	
	//we could use StringBuffer or StringBuilder
	
	public static String reverse2(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		
		String day = "Thursday";
		
		String reversed = reverse(day);
		System.out.println("The reversed string is: " + reversed);
		
		System.out.println(reverse2(day));
	}
	
	
	
}
