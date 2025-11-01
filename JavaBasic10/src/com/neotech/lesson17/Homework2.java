package com.neotech.lesson17;

public class Homework2 {
	// Create a String that should be a combination of letters, numbers and special
	// characters.
	// Find out how many alpha characters are there in the String. (alpha characters
	// means letters)
	public static void main(String[] args) {

		String str = "Hello%4$#.* every$&!@##.one!3445;434:";

		// regular expression [^a-zA-Z] finds all chars that are not alpha
		String noSpecialChar = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		System.out.println(noSpecialChar);

		System.out.println(str.replaceAll("[^a-zA-Z]", ""));

		// this one removes the letters(alpha chars)
		String str2 = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str2);
	}

}
