package com.neotech.lesson16;

public class Task2 {

	public static void main(String[] args) {
		// Create a String
		// and if the String is not empty perform the following:
		// - if the String has an odd number of characters
		// and has 3 or more characters,
		// print the character in the middle of the String.

		String str = "Halil";
		if (!str.isEmpty()) 
		{
			if (str.length() % 2 == 1 && str.length() >= 3) 
			{
				//how can I print the middle letter
				System.out.println(str.charAt(str.length()/2));
			}
		}
		
		
		
		
		//I did not like using .length all the time, can this be different
		
		int nameLength = str.length();
		
		if (nameLength!=0)
		{
			if (nameLength % 2 == 1 && nameLength >= 3)
			{
				System.out.println(str.charAt(nameLength/2));
			}
		}
		

	}

}
