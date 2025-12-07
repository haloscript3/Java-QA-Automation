package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {

		// TreeMap: entries will be ordered ASC according to key
		Map<String, Integer> groceries = new TreeMap<>();

		groceries.put("Milk", 1);
		groceries.put("Bread", 2);
		groceries.put("Eggs", 12);
		groceries.put("Cookies", 3);
		// groceries.put(null, 4);//NullPointerException

		System.out.println(groceries);

		// how can i remove cookies?
		groceries.remove("Cookies");
		System.out.println(groceries);

		// can i iterate over the map?
		Set<String> keys = groceries.keySet();
		// loop over the items of the keys
		for (String key : keys) {
			System.out.println(key + ": " + groceries.get(key));
		}

		// get the values of the map as a collection object
		Collection<Integer> values = groceries.values();
		System.out.println(values);

		// iterate over the values
		Iterator<Integer> it = values.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
