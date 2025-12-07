package com.neotech.review10;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {

		Map<Integer, String> phonebook = new HashMap<>();
		phonebook.put(11111, "Clinton");
		phonebook.put(22222, "Obama");
		phonebook.put(33333, "Taylor Swift");
		phonebook.put(44444, "Clinton");
		phonebook.put(55555, "Kamala");
		phonebook.put(66666, "Mamdani");

		System.out.println(phonebook);

		// It will replace "Taylor Swift" with "Leonardo"
		phonebook.replace(33333, "Leonardo");

		// Another way to replace
		// phonebook.put(33333, "Leonardo");

		phonebook.remove(66666); // Will remove the pair/entry from my map
		System.out.println(phonebook);

		System.out.println("The size of my phonebook is -> " + phonebook.size());

		// Map is one-directional, from the KEY to the VALUE
		// There in NO way to go from the VALUE to the KEY

		String name = phonebook.get(33333);
		System.out.println(name + " is calling...");

		name = phonebook.get(66666);
		System.out.println(name + " is calling...");

		boolean containsK = phonebook.containsKey(33333);
		System.out.println("The phonebook contains 33333 -> " + containsK);

		boolean containsV = phonebook.containsValue("Taylor Swift");
		System.out.println("Taylor Swift is in my phonebook -> " + containsV);

		// We CANNOT iterate the Map

		// Let's get all the KEYS and store them into a SET
		System.out.println("--------phonebook.keySet()--------");

		Set<Integer> numbers = phonebook.keySet();
		System.out.println(numbers);

		Iterator<Integer> itNums = numbers.iterator();
		while (itNums.hasNext()) {
			Integer number = itNums.next();

			// Find the name/value by using the number/key
			String personName = phonebook.get(number);
			System.out.println(number + " -> " + personName);
		}

		// Let's get all the VALUES and store them into a COLLECTION
		System.out.println("--------phonebook.values()--------");

		Collection<String> names = phonebook.values();
		System.out.println(names);

		for (String element : names) {
			System.out.println(element);

			// From the value we CANNOT find the key
			// phonebook.get(element);
		}

		// Task
		// Get the Entries from the Map
		// Iterate them using Enhanced for loop
		// Iterate them using Iterator

		// Let's get all the ENTRIES and store them into a SET
		System.out.println("--------phonebook.entrySet()--------");

		Set<Entry<Integer, String>> entries = phonebook.entrySet();
		System.out.println("map -> " + phonebook);
		System.out.println("set -> " + entries);

		System.out.println("--------iterate using enhanced for loop--------");

		for (Entry<Integer, String> entry : entries) {
			// System.out.println(entry);

			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "->" + value);
		}

		System.out.println("--------iterate using iterator--------");

		Iterator<Entry<Integer, String>> entryIt = entries.iterator();

		while (entryIt.hasNext()) {
			Entry<Integer, String> entry = entryIt.next();

			System.out.println(entry.getKey() + "<=>" + entry.getValue());
		}

	}

}
