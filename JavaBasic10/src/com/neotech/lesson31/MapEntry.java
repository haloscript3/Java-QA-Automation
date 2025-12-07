package com.neotech.lesson31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {

		Map<String, Integer> months = new LinkedHashMap<>();
		
		months.put("January", 31);
		months.put("February", 28);
		months.put("March", 31);
		months.put("April", 30);
		
		System.out.println(months);
		
		// [January, February, March, April] ----> Set of Keys 
		// [31, 28, 31, 30]   ---> Collection of Values
		
		//We want to put a name for this: 
			//January=31   ---> we will call it an Entry
			//February=28 ---> this another Entry....
			//so, we can say that Map is made up of Entry objects 
		
		// an Entry is represented with an Entry<K, V> object. In this case, Entry<String, Integer>
		
		
		Set<Entry<String, Integer>> entries = months.entrySet();
		System.out.println(entries);
		
		
		// Can we loop through the Map object??? 
		// Now that we have put the Map into a Set of Entries, I can loop through them 
		
		for (Entry<String, Integer> entry : entries)
		{
			System.out.println(entry.getKey()  +  " = " + entry.getValue());
		}
		
		
		// Can I use an iterator on the entries??? YES 
		Iterator<Entry<String, Integer>> it = entries.iterator();
		
		while(it.hasNext())
		{	
			Entry<String, Integer> entry = 	it.next();

			System.out.println("This is the entry object: " + entry);
			
			
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}
		
		
	}

}
