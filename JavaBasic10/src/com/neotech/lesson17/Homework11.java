package com.neotech.lesson17;

public class Homework11 {
	// Create a String and print it in reverse order (Sunday -> yadnuS).
	// Solve it using charAt(), toCharArray() and reverse() methods.
	// Note:
	// for charAt() and toCharArray() use String
	// for reverse you have to declare a StringBuffer object
	public static void main(String[] args) {

		String str = "Sunday";

		// 1st way
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
		}

		System.out.println();

		// 2nd way
		char[] letters = str.toCharArray();
		for (int i = letters.length - 1; i >= 0; i--) {
			char c = letters[i];
			System.out.print(c);
		}

		System.out.println();

		// 3rd solution
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

		// 4th solution
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2.reverse());
	}

}
