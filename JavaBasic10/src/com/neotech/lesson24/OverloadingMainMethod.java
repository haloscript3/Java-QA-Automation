package com.neotech.lesson24;

public class OverloadingMainMethod {

	// which main method will run?
	// Java will run the default main method: main(String[] args)

	public static void main(String[] args) {

		System.out.println("I am in MAIN method");

		// call the first overload
		main("Hello", "Class");

		// call the second overload
		int[] input = { 1, 2, 3 };
		main(input);
	}

	// first overload
	public static void main(String str1, String str2) {
		System.out.println("I am in main method with two strings!");
		System.out.println(str1 + " " + str2);
	}

	// second overload
	public static int main(int[] args) {
		System.out.println("I am in main method with int array");
		return 0;
	}
}
