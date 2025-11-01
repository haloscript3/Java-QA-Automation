package com.neotech.lesson17;

public class Homework1 {
	// Create a String that will hold a sentence.
	// Write a program to get a new String without any spaces.
	public static void main(String[] args) {

		String str1 = "I love Java!";

		// expected output: IloveJava!

		// lets talk about the replace method:
		String strWithNoSpace = str1.replace(" ", "");
		System.out.println(strWithNoSpace);

		// how can i get: I-love-Java!
		String str2 = str1.replace(" ", "-");
		System.out.println(str2);

		// now lets talk about replaceAll() method
		String str3 = "I love programming in Phyton and I want to learn more Phyton!";

		// Lets replace Phyton with Java
		String newString = str3.replaceAll("Phyton", "Java");
		System.out.println(newString);

		// how can i remove all vowels from my new string? // a,e,i,o, u
		String noVowels = newString.replaceAll("[aeiou]", "*");
		System.out.println(noVowels);

		// this does nothing, it tries to find "auiou" inside the main string
		System.out.println(newString.replaceAll("aeiou", "*"));

		System.out.println("The size of str1 is " + str1.length());
		System.out.println("The size with no space is " + strWithNoSpace.length());

	}

}
