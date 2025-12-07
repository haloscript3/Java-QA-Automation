package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> candy = new ArrayList<String>();
		
		candy.add("Hersheys");
		candy.add("Snickers");
		candy.add("M&M");
		candy.add("AlBeni");
		
		ArrayList<String> sweets = new ArrayList<String>();
		
		sweets.add("Baklava");
		sweets.add("Sutlac");
		sweets.add("Sour Skittles");
		sweets.add("Pan dulces");
		
		
		//can I add all candy items into the sweets ArrayList? 
		sweets.addAll(candy);
		
		System.out.println("The size of sweets list is: " + sweets.size());
		
		
		//How do I iterate the sweets collection??? 
		//(1) Loops -- indexed or foreach
		//(2) Iterator
		
		
		//Very simple structure, only three methods: hasNext(), next(), remove()
		Iterator<String> it = sweets.iterator(); 
		
		
		while(it.hasNext()) //if there is a next element
		{
			String element = it.next();
			
			System.out.print(element + " ");
			
			//if I wanted to remove Hersheys
			if (element.equals("Hersheys"))
			{
				it.remove();
			}
		}
		System.out.println("----------------------");
		System.out.println(sweets);
		
		
		
		
	}

}
