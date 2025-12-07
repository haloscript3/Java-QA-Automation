package com.neotech.review05;

public class ReplaceDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today because today is not Monday";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);

		System.out.println("--------------------------------");

		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);

		String ssn = "926-418-0232";
		System.out.println(ssn);

		String newSSN = ssn.replaceAll("[2-5]", "#");
		System.out.println(newSSN);

		System.out.println("Let's remove the dashes from ssn");
		String numbers = ssn.replaceAll("[^0-9]", "");
		System.out.println(numbers);

		// Task for Alisan and Maya and the hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// ****-***-5061
	}

}
