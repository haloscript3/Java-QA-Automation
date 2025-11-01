package com.neotech.lesson18;

public class Homework2 {
	// Write a program to print out the following conversion:
	// Today is Tuesday and we have a Java Class!!! to
	// yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
	public static void main(String[] args) {

		String str = "Today is Tuesday and we have a Java Class!!!";

		// first split the string into pieces
		String[] words = str.split(" ");
		// System.out.println(Arrays.toString(words));

		// create a homework2 object
		Homework2 hm2 = new Homework2();

		// second, loop over each word and reverse it
		for (String word : words) {
			String reversedWord = hm2.reverse(word);
			System.out.print(reversedWord + " ");
		}
	}

	String reverse(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			reversed = reversed + c;
		}

		return reversed;
	}

}
