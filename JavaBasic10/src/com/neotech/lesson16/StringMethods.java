package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {

		// 1st way to declare a String --> string literal
		String name = "sabah";
		
		
		// 2nd way to declare a String --> using new keyword
		String name2 = new String("Eo");
		
		
		//.length()
		
		//.length() its a behavior of String objects, I can only use it 
		//for String objects 
		int size = name.length();
		System.out.println("The length of the name is: " + size);
		
		
		String school = "NeoTech";
		System.out.println("The length of the school is: " + school.length());
		
		
		String school2 = "                 NeoTech          ";
		System.out.println("The length of the school is: " + school2.length());
		
		
		//-----------------------------------
		
		//.toLowerCase() & .toUpperCase()
		
		String city = "New York";
		String lowerCaseCity = city.toLowerCase();
		System.out.println(lowerCaseCity);
		
		System.out.println(city.toUpperCase());
		
		//What is the value of the String city
		System.out.println(city);
		//String objects are immutable, they are not changeable.
		
		city = "New York City"; 
		//I did not changes 'New York', but I 
		//changed what city variable points to
		
		System.out.println(city);
		
		
		String newCity = "New York"; //is this a new String???
		// This is a new variable, but not a new String 
			// New York was already created on memory String pool
		
		
		//this is true only when using String literal to create the String
		String anotherCity = new String("New York");
		//did this create a new string?
		
		//-----------------------------------

		
		//.concat()
		
		//joining strings a.k.a concatenation
		String sentence = "The size of the " + school + " is " + school.length();
		System.out.println(sentence);
		
		String firstName = "Donald";
		String lastName = "Duck";
		
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		String fullName2 = firstName + " " + lastName;
		System.out.println(fullName2);
		
		String fullNameConcat = firstName.concat(lastName);
		System.out.println(fullNameConcat);
		
		//can I put a space when I use concat
		//method chaining: I can call concat many times after itself
		//since it will always return a String
		String nameWithSpace = firstName.concat(" ").concat(lastName);
		System.out.println(nameWithSpace);
		
		//method chaining example: 
		
		String methodChaining = 
					firstName
					.concat(" ")
					.concat(lastName)
					.concat(" ")
					.concat(school)
					.toUpperCase();
		
		System.out.println(methodChaining);
		
		//-----------------------------------
		
		//.isEmpty() & .isBlank()
		
		String str = " ";
		System.out.println(str.isEmpty());  //this checks if the length of the String is 0
		//System.out.println(str.isBlank()); //this checks if the String has only spaces
		
		//-----------------------------------
		
		//.trim();
		
		String str2 = "              Today is     Wednesday    and "  + 
		" we are learning                  some really cool "
		+ "stuff           !                   ";
		
		System.out.println("The length of str2 is: " + str2.length());
		System.out.println(str2);	
		
		System.out.println(str2.trim());
		System.out.println("The length of str2 after trimming: " + str2.trim().length());
		
	}

}
