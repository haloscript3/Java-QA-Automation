package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
	// Create an ArrayList with 6 names.
	// Have at least 2 duplicates.
	// How can you remove the duplicates from the ArrayList?
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Ozzy");
		names.add("Alisan");
		names.add("Ciara");
		names.add("Mercedes");
		names.add("Bahar");
		names.add("Brenda");
		names.add("Ozzy");
		names.add("Ciara");
		// names.add(null);

		System.out.println(names);

		// If i can convert my array list into an object that does not allow duplicates,
		// i will have the task completed

		// 1st way: Convert it into a HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.addAll(names);
		System.out.println(hashSet);

		// 2nd way: Convert it into a LinkedHashSet
		Set<String> linkedSet = new LinkedHashSet<>(names);
		System.out.println(linkedSet);

		// lets remove the null from the list so tree set does not fail
		names.remove(null);

		// 3rd way: Convert it into a TreeSet
		Set<String> treeSet = new TreeSet<>(names);
		System.out.println(treeSet);

		// can i find a certain item in a set object?
		if (treeSet.contains("Bahar")) {
			System.out.println("Set contains Bahar!");
		}

		// how can i get a specific item from my set?
		// convert the set into a list object
		List<String> list = new ArrayList<>(treeSet);
		String secondItem = list.get(1);
		System.out.println(secondItem);

		// can i convert the set object into an array? YES
		Object[] array = treeSet.toArray();
		System.out.println(Arrays.toString(array));

		// Can i sort my array?
		Arrays.sort(array); // if there is a null in array, this method will fail
		System.out.println(Arrays.toString(array));

		// how can i sort my names object?
		Collections.sort(names);
		System.out.println(names);

		// how can i reverse the names object?
		Collections.reverse(names);
		System.out.println(names);
	}

}
