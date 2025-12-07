package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		/*
		 
		 	Create a Map from array of cities that will sort keys in alphabetical order. 
			As a key store the name of the city and as a value store the length of the city 
			(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
 			- If any city name is more than 7 characters remove that city .
		 
		 */
		
		String[] cities = {"Paris", "London", "Tirana", "Washington DC"};
		
		
		Map<String, Integer> map = new TreeMap<>();
		
		for (String city : cities)
		{
			map.put(city, city.length());
		}
		
		
		System.out.println(map);
		
		
		//Since I will be removing elements, I cannot use enhanced for.
		//It is risky modifying a collection that I am looping on at runtime
		//So, to avoid that, I will use an iterator
		
		
		
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			
			if (entry.getValue() > 7)
			{
				it.remove();
			}
		}

		//the EntrySet is a reference to the map. So, when I drop an element 
		//from it, then it will be dropped from the map!!!
		System.out.println(map);
	}

}
