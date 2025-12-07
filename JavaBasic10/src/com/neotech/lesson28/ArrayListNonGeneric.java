package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {


		ArrayList<Double> numbers = new ArrayList<>();
		
		numbers.add(5.5);
		numbers.add(6.2);
		numbers.add(6.5);
		//numbers.add("seven");
		numbers.add(7.5);
		
		//When we define a type, then it will only accept that
		System.out.println(numbers);
		
		//replacing an item
		numbers.set(0, 8.5);
		System.out.println(numbers);

		
		//remove by index
		numbers.remove(0);
		System.out.println(numbers);

		//remove by object
		numbers.remove(7.5);
		System.out.println(numbers);
		
		
		//how do I get 6.5?
		numbers.get(1);
		
		//Can I print it?
		System.out.println(numbers);
		
		//I can print with a for each loop
		for (Double num : numbers)
		{
			System.out.println(num);
		}

		for (int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
		
		System.out.println("-----------------------------------");
		
		
		//Generic ==> type-safe, defines a type
		//Non-Generic ==> Raw
		
		
		//non-generic ArrayList
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add("Ozzy");
		arrayList.add(5.5);
		arrayList.add('$');
		
		arrayList.add(numbers);

		
		for (Object el : arrayList)
		{
			System.out.println(el);
		}
	}
	

}
