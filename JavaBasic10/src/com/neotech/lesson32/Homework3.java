package com.neotech.lesson32;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
	// Create a collection of integers in which you can keep duplicates.
	// Write a logic to find sum of all integers
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(34);
		numbers.add(2);
		numbers.add(344);
		numbers.add(11);

		// how do i get the sum?
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		System.out.println("Sum is " + sum);

	}

}
