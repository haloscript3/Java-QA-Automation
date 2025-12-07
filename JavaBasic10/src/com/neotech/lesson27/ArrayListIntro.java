package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// array
		int[] numbers = new int[5];
		// the size of numbers array is 5 and it wont change

		ArrayList<String> names = new ArrayList<>();

		// .add will add at the end of the list
		names.add("Burak");
		names.add("Cris");
		names.add("Ozzy");
		names.add(0, "Alisan");

		System.out.println(names);
		System.out.println("The size of the list is " + names.size());

		System.out.println("We may iterate over the items of the array using a for loop");

		// basic for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		System.out.println("Using for each loop");

		for (String name : names) {
			System.out.println(name);
		}

	}

}
