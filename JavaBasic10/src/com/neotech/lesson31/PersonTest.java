package com.neotech.lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {

		
		//I want to create a Map of a Person with their id (Key)
		
		Map<Integer, Person> people = new TreeMap<>();


		people.put(1, new Person("John", "Doe", 30, 65000));
		people.put(5, new Person("Jane", "Doe", 35, 75000));
		people.put(2, new Person("Jack", "Doe", 28, 55000));
		
		//a set of what?? Entry<Integer, Person>
		Set<Entry<Integer, Person>> entries = people.entrySet();
	
		
		for (Entry<Integer, Person> entry : entries)
		{
			Person p = entry.getValue();
			
			System.out.println(entry.getKey() + " --> " + p.firstName + " " + p.lastName);
			
			
			p.printDetails();
			System.out.println("-------------------------------------------------------");
		}
		
		
		
	}

}
