package com.neotech.review07;

public class City {

	//The class name must match the file name.
	//Only one public class in a file
	public static void main(String[] args) {
		
		//Can I do this: 
		City c1 = new City(); 
		Country c2 = new Country();
		Continent c3 = new Continent();
		
		//private elements are only accessible within the class (not within the file) 
		//System.out.println(c3.name);
	}

}
class Country
{

}

class Continent
{
	private String name = "Europe";
}


