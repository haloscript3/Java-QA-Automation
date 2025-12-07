package com.neotech.lesson31;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {


		Hashtable<Integer, String> ht = new Hashtable<>();
		
		
		
		ht.put(2, "Ozzy");
		ht.put(1, "Ciara");
		ht.put(4, "Eo");
		ht.put(3, "Halil");
		
		System.out.println(ht);
		
		System.out.println("The size of my hash table is: " + ht.size());

		
		// Hashtable is synchronized/thread-safe
		
		
		
	}

}
