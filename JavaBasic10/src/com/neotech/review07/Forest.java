package com.neotech.review07;

public class Forest {

	public static void main(String[] args) {
		
		Wolf w = new Wolf("Rusty", 4);
		
		w.sleep();
		w.displayInfo();
		
		System.out.println("---------------------------");
		
		Bear b = new Bear("Yogi", 2);
		b.sleep();
		b.roar();
		b.displayInfo();
		
		System.out.println("---------------------------");
		
		
		Fox f = new Fox("Sly", 4, "Orange");
		f.sleep();
		f.displayInfo();
		//f.roar(); //we inherit only from parent class 
		
		
		
	}

}
