package com.neotech.review10;

import java.util.*;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>(); // ordered by key
		europe.put("Italy", "Rome");
		europe.put("Spain", "Madrid");
		europe.put("Albania", "Tirana");
		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("South Africa", "Capetown");
		africa.put("Morocco", "Rabat");
		africa.put("Kenya", "Nairobi");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>(); // random order
		asia.put("Japan", "Tokyo");
		asia.put("Georgia", "Tbilisi");
		asia.put("Turkiye", "Ankara");
		System.out.println(asia);

		// HW1 iterate europe by getting keys
		// HW2 iterate africa by getting values
		// HW3 iterate asia by getting entries

		System.out.println("--------WORLD--------");

		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		System.out.println("WORLD -> " + world);
		System.out.println("SIZE -> " + world.size());

		Map<String, String> map1 = world.get(1); // get the element with index 1
		System.out.println("The object/element with index 1 is -> " + map1);

		System.out.println("--------Let us iterate the world--------");
		
		for (Map<String, String> continent : world) {
			// System.out.println(continent);
			
			Set<String> countryNames = continent.keySet();
			
			for (String country : countryNames) {
				System.out.println(country + " -> " + continent.get(country));
			}
			
			System.out.println("--------");
		}
	}

}
