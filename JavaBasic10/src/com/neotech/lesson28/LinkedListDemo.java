package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		
		//[]
		list1.add("Shekinah");
		//["Shekinah"]
		list1.add("Alisan");
		//["Shekinah", "Alisan"]
		list1.add("Ozzy");
		//["Shekinah", "Alisan", "Ozzy"]
		list1.add("Maya");
		//["Shekinah", "Alisan", "Ozzy", "Maya"]
		list1.add(0, "Ciara");
		//["Ciara", "Shekinah", "Alisan", "Ozzy", "Maya"] //here the list has to push all the elements to index + 1
		
		
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		//
		list2.add("Ozzy");
		//Begin => "Ozzy"  => End
		list2.add("Sabah");
		//Begin => "Ozzy" -> "Sabah"  => End
		list2.add("Shekinah");
		//Begin => "Ozzy" -> "Sabah" -> "Shekinah"  => End
		list2.add(0, "Alisan");
		//Begin => Alisan -> "Ozzy" -> "Sabah" -> "Shekinah"  => End
		
		
		System.out.println(list2);
		
		for (String name : list2)
		{
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		Iterator<String> it = list2.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		
	}

}
