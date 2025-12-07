package com.neotech.review09;

import java.util.*;

public class CollectionIntro {

	public static void main(String[] args) {
		// List is an Interface
		// ArrayList and LinkedList are 2 classes implementing the List Interface

		List<String> africa1 = new ArrayList<>(); // Up-casting
		africa1.add("Nigeria");
		africa1.add("Kenya");
		africa1.add("Morocco");
		africa1.add(0, "Egypt"); // Adding to the list with index
		// africa1.add(2); // Compile-time Error. Cannot store an integer

		System.out.println("africa1 -> " + africa1);

		// 2nd way of filling the ArrayList
		List<String> africa2 = new ArrayList<>(); // Creating an empty list
		africa2.addAll(africa1);

		System.out.println("africa2 -> " + africa2);

		// 3rd way of filling the ArrayList
		List<String> africa3 = new ArrayList<>(africa1); // Creating an filled list

		System.out.println("africa3 -> " + africa3);

		System.out.println("--------------------------------");

		// There are 3 ways to iterate the list

		for (int i = 0; i < africa1.size(); i++) {
			String country = africa1.get(i);
			System.out.print(country + " ");
		}
		System.out.println();

		for (String country : africa1) {
			System.out.print(country + " ");
		}
		System.out.println();

		System.out.println("--------Iterator--------");

		Iterator<String> iterator = africa1.iterator();

		while (iterator.hasNext()) {
			String country = iterator.next();
			System.out.print(country + " ");
		}
		System.out.println();
	}

}
