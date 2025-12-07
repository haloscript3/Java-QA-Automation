package com.neotech.lesson32;

import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {
	// Create the collection that will store single unique objects of a String type
	// in which order is preserved. Write a logic to concatenate all string from the
	// collection.
	public static void main(String[] args) {

		Set<String> words = new LinkedHashSet<>();

		words.add("Today");
		words.add("is");
		words.add("Saturday");
		words.add("and");
		words.add("we");
		words.add("are");
		words.add("having");
		words.add("fun!");

		System.out.println(words);

		String output = "";

		for (String word : words) {
			output += word + " ";
			// output.concat(word).concat(" ");
		}

		System.out.println(output);

		// 2nd way: StringBuilder
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			sb.append(word).append(" ");
		}

		System.out.println(sb);

	}

}
