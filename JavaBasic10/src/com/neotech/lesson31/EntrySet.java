package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();
		
		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		// Print the list and check the order of the countries.
		System.out.println(countries);
		
		
		//what are the entry objects in the countries Map? 
			// Entry<String, String> 
		Set<Entry<String, String>>  entries = countries.entrySet();

		System.out.println(entries);
		
		for (Entry<String, String> entry : entries)
		{
			String country = entry.getKey();
			String capital = entry.getValue();
			
			System.out.println(country + " ----> " + capital);
		}
		
		
		// Can we use an Iterator??? It is a Set, so YES!!!
		
		Iterator<Entry<String, String>> it = entries.iterator();
		
		
		while(it.hasNext())
		{
			Entry<String, String> entry = it.next();
			
			System.out.println(entry.getKey().toUpperCase() + " ----> " + entry.getValue().toUpperCase());
		}
		
	}

}
