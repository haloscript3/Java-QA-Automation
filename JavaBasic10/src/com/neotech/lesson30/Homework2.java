package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {
	// Create a Set of cities in which you want to make sure that insertion order
	// is maintained.
	// Using Iterator remove any city that starts with “A”;
	public static void main(String[] args) {
		// if insertion order has to be maintained, we have to use a LinkedHashSet

		Set<String> cities = new LinkedHashSet<>();

		cities.add("Tirana");
		cities.add("Albuquerque");
		cities.add("Cincinnati");
		cities.add("Houston");
		cities.add("amsterdam");
		cities.add("Istanbul");

		System.out.println(cities);

		Iterator<String> it = cities.iterator();

		while (it.hasNext()) {
			String city = it.next();

			// consider the possibility of lower case city name
			if (city.toUpperCase().startsWith("A")) {
				it.remove();
			}
		}

		System.out.println(cities);

	}
}
