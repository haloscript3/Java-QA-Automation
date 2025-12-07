package com.neotech.lesson30;

import java.util.ArrayList;
import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Volkan");// index 0
		names.add("Ciara"); // index 1
		names.add("Achraf");// index 2

		HashMap<Integer, String> map = new HashMap<>();

		// key has to be unique
		map.put(0, "Volkan");
		map.put(1, "Ciara");
		map.put(2, "Achraf");

		System.out.println(map);

		System.out.println("-----------");

		// value of key=2 will be updated
		map.put(2, "Ozzy");
		System.out.println(map);

		// check if map is empty
		System.out.println(map.isEmpty());

		// get the size of the map object
		System.out.println(map.size());

		// can i do this?
		// map.put("3", "Bahar");
		map.put(3, "Bahar");
		System.out.println(map);

		// get a value from the map
		String value1 = map.get(1);
		System.out.println(value1);

		String value10 = map.get(10);
		System.out.println(value10);

		// to replace an item
		map.replace(3, "Mercedes");
		System.out.println(map);

		// remove an item
		map.remove(2);
		System.out.println(map);

		// check if an item exists in map by key
		System.out.println(map.containsKey(3));

		// check if an item exists in map by value
		System.out.println(map.containsValue("Ozzy"));

	}

}
