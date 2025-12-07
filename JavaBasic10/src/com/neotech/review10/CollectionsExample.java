package com.neotech.review10;

import java.util.*;

public class CollectionsExample {
	// Collections Framework -- All interface and implementations
	// Collection Interface -- Only on interface
	// Collections Class -- It is a helper/utility class

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>(); // Up-casting
		numbers.add(73);
		numbers.add(15);
		numbers.add(36);
		numbers.add(91);
		numbers.add(48);

		System.out.println(numbers);

		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);

		System.out.println("max -> " + Collections.max(numbers));

		// SET cannot be sort/ordered
		// Collections.sort(numbers);

		List<Integer> numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);

		Collections.sort(numberList);
		System.out.println("List after sorting -> " + numberList);

		System.out.println("--------------------------------");

		List<String> students = new LinkedList<String>();
		students.add("Ozzy");
		students.add("Halil");
		students.add("Alisan");
		students.add("Ylli");
		students.add("Brenda");
		System.out.println(students);

		String first = Collections.min(students);
		System.out.println("first -> " + first);
		System.out.println("last -> " + Collections.max(students));

		Collections.sort(students);
		System.out.println(students);

		System.out.println("--------------------------------");

		int[] arr = { 8, 1, 6, 3, 5 };
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}
