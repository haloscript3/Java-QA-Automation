package com.neotech.lesson20;

import java.util.Scanner;

public class Homework {
//	Create a method that will accept a String as a parameter and return a new 
//	String that consists only of vowels. The method should be available only inside the 
//	class where it was declared and executed by.

	// lets analyze the requirements:
	// String parameter, String return type
	// it will be private
	// it will be static

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your text:");
		String userInput = scan.nextLine();

		// in one line
		System.out.println(getVowels(userInput));

		// in two lines
//		String onlyVowels = getVowels(userInput);
//		System.out.println(onlyVowels);

		scan.close();

	}

	private static String getVowels(String input) {
		// if i replace all non-vowels with empty string
		// that will give me the vowels only
		// [^aeiuoAEIOU] --> this finds all non-vowels

		String onlyVowels = input.replaceAll("[^aeiuoAEIOU]", "");
		return onlyVowels;

		// or in one line
		// return input.replaceAll("[^aeiuoAEIOU]", "");
	}

}
