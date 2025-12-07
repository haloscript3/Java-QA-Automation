package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
	// Create a Set collection in which you need to add names of the countries.
	// In this set we want all objects to be sorted in alphabetical order.
	// Using 2 different ways retrieve all elements from set.
	public static void main(String[] args) {

		// alphabetical sorting mean TreeSet
		Set<String> countries = new TreeSet<>();

		countries.add("USA");
		countries.add("China");
		countries.add("Russia");
		countries.add("Brazil");

		System.out.println(countries);

		// 1st way: Enhanced for loop
		for (String country : countries) {
			System.out.println(country);
			// countries.remove(country);//Gives CurrentModificationException
		}

		// 2nd way: Iterator
		Iterator<String> it = countries.iterator();

		while (it.hasNext()) {
			String country = it.next();

			System.out.println(country.toUpperCase());
			System.out.println(country);

			// can i do this? YES, with iterator it is safe to modify the collection object
			// it.remove();
		}

		System.out.println(countries);

	}

}
