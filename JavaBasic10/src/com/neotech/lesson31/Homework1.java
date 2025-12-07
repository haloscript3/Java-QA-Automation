package com.neotech.lesson31;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {

	public static void main(String[] args) {

		/*
		Create a map of car models that you have in your garage and for each model the number of cars you have.
		So the Key is the model and the value is the number of cars. Use LinkedHashMap.
		For example:
		"BMW" -> 2
		"Mercedes" -> 3
		"Audi" -> 3
		"Ferrari" -> 1

		- Check how many entries you have.
		- Update the number of Audis to 5.
		- Add a new model with any number of cars.
		- Check how many Ferraris you have.
		- Check if you have Honda in your map.
		- Remove Mercedes from the map.
		- Get all models from the map. (use keySet() method)

		Note: After each step print the map.
	*/
		
		
		Map<String, Integer> cars = new LinkedHashMap<>();
		
		System.out.println(cars);
		
		cars.put("BMW", 2);
		cars.put("MB", 3);
		cars.put("Audi", 3);
		cars.put("Ferrari", 1);
		
		System.out.println(cars);
		
		// Check how many entries you have.
		System.out.println("I have " + cars.size() + " types of cars in my garage!");
		
		// Update the number of Audi's to 5.
		cars.put("Audi", 5);
		 
		// Add a new model with any number of cars.
		cars.put("Honda", 1);
		System.out.println(cars);
		
		// Check if you have Honda in your map.
		System.out.println("Do I have a Honda? " + cars.containsKey("Honda"));
		
		// Check how many Ferraris you have.
		System.out.println("I have " + cars.get("Ferrari") + " Ferraris!");
		
		// Remove Mercedes from the map.
		cars.remove("Honda");
		System.out.println(cars);
		
		
		//** keys need to be UNIQUE...  
		//** values can have duplicates
		
		
		//If I ever needed to store all of the keys somewhere, it would be on a SET..so that they remain unique
		//If I ever needed to store all of the values somewhere, it would a Collection or a list (anything but a SET) 
		
		
		// Get all models from the map. (use keySet() method)

		Set<String> keys = cars.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = cars.values();
		System.out.println(values);
		
		
		
	}

}
