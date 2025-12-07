package com.neotech.review09;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<String> asia = new LinkedList<>(); // Up-casting
		asia.add("China");
		asia.add("Turkiye");
		asia.add("Japan");
		asia.add("Mongolia");
		asia.add("China");
		asia.add("India");
		asia.add("Japan");

		System.out.println("asia -> " + asia);

		// Task
		// Iterate the Asia list and remove duplicates
		// hint: you can create a new List, add the elements one by one
		// but first check if the new list CONTAINS the country

		System.out.println("----Doing the same thing using for loop----");

		// Create a new list
		List<String> asia2 = new LinkedList<>();

		for (String country : asia) {
			if (asia2.contains(country)) {
				System.out.println("The country " + country + " exists in the list");
			} else {
				asia2.add(country);
			}

		}

		System.out.println("asia2 -> " + asia2);

		System.out.println("----Doing the same thing using iterator----");

		List<String> asia3 = new LinkedList<>();

		Iterator<String> iter = asia.iterator();

		while (iter.hasNext()) {
			String country = iter.next();

			if (!asia3.contains(country)) {
				asia3.add(country);
			}
		}

		System.out.println("asia3 -> " + asia3);

	}

}
