package com.neotech.lesson28;

public abstract class Flower {

	String type;
	
	public Flower(String type)
	{
		this.type = type;
	}
	
	public void smell()
	{
		System.out.println("Flowers smell good!");
	}
	
	public abstract void bloom();
	
	
}

class Rose extends Flower
{

	public Rose(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " bloom in Summer!");
	}
	
}



class Tulip extends Flower 
{

	public Tulip(String type) {
		super(type);
	}

	@Override
	public void bloom() {	
		System.out.println(type + " bloom in Spring!");
	}
	
}



class Sunflower extends Flower
{

	public Sunflower(String type) {
		super(type);
	}

	@Override
	public void bloom() {
		System.out.println(type + " bloom in Fall!");
	}
	
}