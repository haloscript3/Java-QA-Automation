package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {

	
	/*	Create a ArrayList that will store 5 names into it.
		▪ Find out whether the given ArrayList is empty or not?
		▪ Check whether the specific name is present in an ArrayList or not?
		▪ Find the size of your ArrayList and print all values from the ArrayList
	 	*/
	
	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		
		//in arrays: names[0] = "Something";
		
		names.add("Shekinah");
		names.add("Esmeralda");
		names.add("Maya");
		names.add(0, "Ciara");
		names.add("Ozzy");
		
		
		System.out.println("Is the ArrayList empty ??" + names.isEmpty());
		
		System.out.println("Does the ArrayList include Ozzy ??" + names.contains("Ozzy"));
		
		System.out.println("What is the size of the ArrayList ??" + names.size());
		
		System.out.println(names);
		
		for (String name : names)
		{
			System.out.print(name + " ");
		}
		
	}
	
	
	
	
}
