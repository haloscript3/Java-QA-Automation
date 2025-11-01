package com.neotech.lesson17;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {

		String sentence = "Today is Saturday and we are learning Java";
		char[] letters = sentence.toCharArray();
		System.out.println(Arrays.toString(letters));

		for (char letter : letters) {
			System.out.print(letter + "|");
		}

		System.out.println();
		System.out.println("Size of the sentence: " + sentence.length());
		System.out.println("Size of char array: " + letters.length);
	}

}
