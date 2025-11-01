package com.neotech.lesson17;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {

		String sentence = "Today is Saturday and we are learning Java";

		String[] result = sentence.split(" ");
		System.out.println(Arrays.toString(result));

		for (String word : result) {
			System.out.print(word + "-");
		}

		System.out.println();

		System.out.println("There are " + result.length + " words!");

		// what happens now?
		String[] array = sentence.split("e");
		System.out.println(Arrays.toString(array));

		for (String item : array) {
			System.out.print(item + "*");
		}

		System.out.println();

		String names = "Burak1Yasir2Volkan3Maya4Alisan";
		String[] namesArray = names.split("[^a-zA-Z]");
		System.out.println(Arrays.toString(namesArray));

	}

}
