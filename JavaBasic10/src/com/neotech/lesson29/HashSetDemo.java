package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> breakfast = new HashSet<>();

		breakfast.add("eggs");
		breakfast.add("olives");
		breakfast.add("coffee");
		breakfast.add("tea");

		// what will this print? Will return a true since chocolate is not in the set
		System.out.println(breakfast.add("chocolate"));

		// can i add a null value into my breakfast set object? YES
		breakfast.add(null);

		// not allowed since it creates a duplicate
		System.out.println(breakfast.add(null));

		System.out.println(breakfast);

		// HashSet:
		// 1) no guarantee of the insertion order
		// 2) no duplicates
		// 3) allows null

		// loop over the items of the breakfast
		// basic for loop can NOT be used since hashset does not keep index
		// our two options are:
		// advanced for loop and
		// iterator object

		for (String item : breakfast) {
			System.out.print(item + " ");
		}

		System.out.println();
		System.out.println("--------");

		Iterator<String> it = breakfast.iterator();

		// iterator to loop over the items of the breakfast object
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
