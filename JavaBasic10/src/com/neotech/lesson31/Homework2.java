package com.neotech.lesson31;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {

		/*
		 	Create a map of countries with its capital that will store countries in alphabetical order.
			Add them randomly in the map.
			Example:
			    "France" -> "Paris"
			    "Kosovo" -> "Prishtina"
			    "Turkey" -> "Ankara"
			    "USA" -> "Washington DC"
			    "Albania" -> "Tirana"
			    "Italy" -> "Rome"
			
			    - Print the list and check the order of the countries.
			    - Verify if you have your country (Albania, Turkey) in the list ( use containsKey() method )
			    - Verify if a specific capital city is in the list ( use containsValue() method )
			    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
			    - Get all the values (capital names) in a Collection. Print all capital names using iterator. 
		 
		 */
		
		Map<String, String> countries = new TreeMap<>();
		
		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		// Print the list and check the order of the countries.
		System.out.println(countries);
		
		// Verify if you have your country (Albania, Turkey) in the list ( use containsKey() method )
		System.out.println("Is Italy on the map? " + countries.containsKey("Italy"));
		
		
		// Verify if a specific capital city is in the list ( use containsValue() method )
		System.out.println("Is Ankara in the map? " + countries.containsValue("Ankara"));
		
		
		
		// Get all the keys (countries names) in a Set. Print all country names using for each loop.
		Set<String> countryList = countries.keySet();
		
		for (String country : countryList)
		{
			System.out.print(country + " ");
		}
		
		System.out.println();

		
		// Get all the values (capital names) in a Collection. Print all capital names using iterator. 
		Collection<String> capitals = countries.values();
		
		Iterator<String> it = capitals.iterator();
		
		while(it.hasNext())
		{
			String capital = it.next();
			System.out.print(capital + " ");
		}
		
	}

}
