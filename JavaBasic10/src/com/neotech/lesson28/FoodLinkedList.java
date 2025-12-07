package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedList;

public class FoodLinkedList {

	public static void main(String[] args) {

		LinkedList<Food> foodList = new LinkedList<>();

		
		foodList.add(new Food("Salad", "tomoato", 100));
		foodList.add(new MexicanFood("Taco", "Chicken", 300));
		foodList.add(new TurkishFood("Sarma", "Rice", 200));
		
		
		System.out.println("------------------");
		
		//can we loop over the linkedList with an advanced for loop?
		for (Food food : foodList)
		{
			System.out.println(food.foodType + " " + food.ingredients + " " + food.calories);
		}
		
		System.out.println("------------------");

		//can we use an iterator 
		Iterator<Food> it = foodList.iterator();
		
		while(it.hasNext())
		{
			Food f = it.next();
			System.out.println(f.foodType + " " + f.ingredients + " " + f.calories);
		}
		
		
		
	}

}
