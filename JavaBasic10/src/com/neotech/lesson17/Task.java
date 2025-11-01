package com.neotech.lesson17;

import java.util.Arrays;

public class Task {
//	You have a String str = "Is it Saturday? Is it raining? Do we have a Java Class today?"
//	How would you find out how many sentences are in that String?
	public static void main(String[] args) {

		String str = "Is it Saturday? Is it raining? Do we have a Java Class today?";

		// if i split from ?, i can get the sentences
		// to split from ?, i have to use"\\?" or "[?]"

		String[] sentences = str.split("[?]");
		System.out.println("There are " + sentences.length + " sentences!");

		for (String sentence : sentences) {
			System.out.println(sentence.trim());
		}

		String str2 = "Is it Saturday? Is it raining! Do we have a Java Class today.";
		String[] sentences2 = str2.split("[?!.]");

		System.out.println(Arrays.toString(sentences2));
	}

}
