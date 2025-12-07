package com.neotech.lesson23;

public class Homework2 {

	/*
	  Create a class with 3 overloaded static methods.
	  Then call each overloaded methods with specific arguments and observe the results.
	 */

	static void info() {
		System.out.println("Today is saturday!");
	}

	static void info(String day) {
		System.out.println("Today is " + day);
	}

	static void info(String month, String day) {
		System.out.println("Today is " + day + " and the month is " + month);
	}

	public static void main(String[] args) {

		info();

		info("Monday");

		info("November", "Saturday");

		// compile error since no such method exits
		// info("2025", "November", "Saturday");

	}

}
