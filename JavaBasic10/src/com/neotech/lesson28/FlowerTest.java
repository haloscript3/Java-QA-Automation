package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

		Flower[] flowerArray = {
				new Rose("Rose"), 
				new Tulip("Tulip"), 
				new Sunflower("Sunflower")};
		
		
		//Can I add more flower objects? 
		//No 
		
		
		ArrayList<Flower> flowerList = new ArrayList<>();
		
		flowerList.add(new Rose("Rose"));
		flowerList.add(new Tulip("Tulip"));
		flowerList.add(new Sunflower("Sunflower"));
		
		//Can I add more flower objects??
		//Yes
		
		flowerList.add(flowerArray[1]);
		
		
		//Lets iterate over the flower list
		for (Flower flower : flowerList)
		{
			flower.bloom();
		}
		
		
		System.out.println("-----------------------");

		
		for (int i = 0; i < flowerList.size(); i++)
		{
			flowerList.get(i).bloom();
		//	Flower f = flowerList.get(i);
		//	f.bloom();
		}
		
		System.out.println("-----------------------");
		
		Iterator<Flower> it = flowerList.iterator();
		
		while(it.hasNext())
		{
			//can I do this?? 
		//	it.next().bloom();
		//	it.next().smell();
			//if you do that, you have called the .next() method 
			//twice. That means you are calling bloom() for the first
			// flower object, and smell() for the next one
			
			Flower fl = it.next();
			
			fl.bloom();
			fl.smell();
			
			
			
		}
		
	}

}
