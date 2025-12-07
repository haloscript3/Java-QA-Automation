package com.neotech.lesson28;

public class Food {

	String foodType, ingredients;
	int calories;
	
	public Food(String foodType, String ingredients, int calories)
	{
		this.foodType = foodType;
		this.ingredients = ingredients;
		this.calories = calories;
	}
	
}


class MexicanFood extends Food
{

	public MexicanFood(String foodType, String ingredients, int calories) {
		super(foodType, ingredients, calories);
	}
	
}


class TurkishFood extends Food
{
	public TurkishFood(String foodType, String ingredients, int calories) {
		super(foodType, ingredients, calories);
	}
}
 


