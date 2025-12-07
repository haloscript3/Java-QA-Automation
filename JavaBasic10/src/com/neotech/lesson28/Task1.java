package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		/*
	 	Create an arrayList with 6 different words. 
		Remove every word that end with 'e'. Use iterator.
	 */

		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("coffee");
		words.add("tea");
		words.add(0, "milk");
		words.add("soda");
		words.add("water");
		words.add("juice");
		
		System.out.println(words);
		
		// When removing we use iterator!!!!!
		// When we are looping in collection, that means we are using it 
		// If I also want to remove from it, then thats modification number 2 (while using it)
		// To safely remove from collections, we use iterator
/*		for (String el : words)
		{
			if (el.endsWith("e"))
			{
				words.remove(el);
			}
		}
		
		System.out.println(words);
		
	*/
		
		
		//declare the iterator
		Iterator<String> it = words.iterator();
		
		//use hasNext() to check if there is a next element to go to 
		while(it.hasNext())
		{
			String word = it.next();
			
			if (word.endsWith("e"))
			{
				it.remove();
			}
		}
		
		System.out.println(words);
	}

}
