package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
	/*
	 
	Create a map of a building. 
	Store floor number and its associated company name. 
	(Example: 1=Google, 2=Apple, 3=Neotech etc..). 
	Insert 5 entries with duplicate keys and values.
	- Check how many entries you have?
	- Update company on a 4th floor
	- Remove company on the 3th floor
	- Print your map
	 */
	public static void main(String[] args) {

		Map<Integer, String> building = new HashMap<>();

		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "NeoTech");
		building.put(2, "Abc");
		building.put(4, "CNN");
		building.put(5, "Google");
		building.put(null, "OpenAI");

		System.out.println(building);

		System.out.println("Total entries " + building.size());

		// update the company on 4th floor
		building.put(4, "NeoTech");
		System.out.println(building);

		// remove company from third floor
		building.remove(3);
		System.out.println(building);

	}

}
