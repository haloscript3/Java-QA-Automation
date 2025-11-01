package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {

		String str = "Hello";
		str = "Hi";

		str.toUpperCase();
		System.out.println(str);

		System.out.println(str.toUpperCase());

		// for string objects; any change that happens over the string DOES NOT happen
		// to the string object itself!
		// It only changes the location in memory
		// So strings are called immutable

	}

}
