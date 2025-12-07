package com.neotech.lesson32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {
	// Create a Map that will store Employee name and salary.
	// Write a logic to retrieve an employee who gets the highest salary.
	// Output should be in the below format
	// - John Smith=$100000
	public static void main(String[] args) {

		Map<String, Integer> empMap = new HashMap<>();

		empMap.put("Ozzy", 125000);
		empMap.put("Ciara", 111000);
		empMap.put("Brenda", 100000);
		empMap.put("Achraf", 133000);
		empMap.put("Shane", 200000);

		System.out.println("This is the MAP: " + empMap);

		// how do I find the largest number in a container?
		// get the values from the map -> collection
		// from the collection items: assume the first is the largest
		// go over each item, compare it with the first
		// if compared item is bigger, update the largest with this new value

		Collection<Integer> salaries = empMap.values();
		System.out.println("Salaries: " + salaries);

		// find the max salary
		int max = 0;
		for (int salary : salaries) {
			if (salary > max) {
				max = salary;
			}
		}

		System.out.println("Max salary is " + max);
		System.out.println("-----------------");

		// lets find who has this max salary
		Set<Entry<String, Integer>> entrySet = empMap.entrySet();
		System.out.println("This is the entry SET: " + entrySet);

		Iterator<Entry<String, Integer>> it = entrySet.iterator();

		// Each entry is made of: key and value
		// Lets assume the first employee has the max salary

		Entry<String, Integer> maxEntry = it.next();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();

			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}

		System.out.println("The max salary is: " + maxEntry.getKey() + ": " + maxEntry.getValue());

		// We have a Collections utility method to find the max
		// Collections.max(salaries);
	}

}
