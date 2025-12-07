package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		// HashSet -> no duplicates, allows null, no insertion order
		Set<String> veggies = new HashSet<>();
		veggies.add("onion");
		veggies.add("cucumber");
		veggies.add("tomato");
		veggies.add(null);

		veggies.add("onion"); // ignored!
		System.out.println(veggies);

		// LinkedHashSet -> no duplicates, allows null, maintains the insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add(null);

		System.out.println(fruits);

		// TreeSet -> no duplicates, does NOT allow null, sorts in ASC order
		Set<String> food = new TreeSet<>();
		food.add("soup");
		food.add("salad");
		food.add("pizza");

		// adding null is NOT allowed
		// throws runtime exception: requireNonNull
		// food.add(null);

		System.out.println(food);
	}

}
