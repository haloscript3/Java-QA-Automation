package com.neotech.review07_polymorphism;

public class World {

	public static void main(String[] args) {

		
		Human.planet = "Earth";
		
		Human h1 = new Human();
		System.out.println(h1.name + " lives on " + Human.planet);
		
		Human h2 = new Human("John");
		System.out.println(h2.name + " lives on " + Human.planet);
		
		Human.planet = "Mars";
		System.out.println(h2.name + " lives on " + Human.planet);
		
		
		System.out.println("------------------------------");
		
		//Declaring a variable of type Human
//		Human h3; 
		//creating an Albanian object and assigning it to h3 (Human type variable)
//		h3 = new Albanian("Sabah");
		
		Human h3 = new Albanian("Sabah"); //up-casting
		
		System.out.println(h3.name + " lives on " + Human.planet);
		
		
		Human h4 = new Turkish("Halil");
		
		System.out.println("------------------------------");

		//lets make them talk....
		h1.talk();
		h2.talk();
		h3.talk(); //if you look at the method called here, Java says that it will execute the talk() method on 
					//Human class, but instead on runtime, the talk() method in the Albanian class is executed.
		h4.talk();
		
		//Polymorphism: 
			//1. compile time - method overloading
			//2. runtime - method overriding
		
		
		//We dont have this method on the Human class, and h4 (despite having a Turkish object assigned) it of type Human.
		//That means it can only see what is on the Human class. 
		//h4.makeBaklava();
		
		
		System.out.println("-----------------------------------------------");
		//we can downcast h4, since we know its a Turkish object
		Turkish t1 = (Turkish) h4; //downcasting manually
		t1.makeBaklava();
		
		//this will give a runtime error. 
		//Turkish t2 = (Turkish) h3;
		//t2.makeBaklava();
		
		//What is the safest way to downcast
		if (h3 instanceof Turkish)
		{
			Turkish t2 = (Turkish) h3;
			t2.makeBaklava();
		}
		
		
		
		System.out.println("Power of Polymorphism:");
		
		Human[] humans = new Human[6];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3; 	//casting  Albanian --> Human
		humans[3] = h4;		//casting  Turkish --> Human 
		humans[4] = new Human();
		humans[5] = new Albanian(); //casting Albanian --> Human
		
		for (Human h : humans)
		{
			h.talk();
		}
		
		//the same process that happens here, is above too
		double[] values = new double[5];
		values[0] = 5.5;
		values[1] = 6.5;
		values[2] = 3; //casting --> it becomes 3.0
		values[3] = 8; //casting --> it becomes 8.0
		values[4] = 7.5;
		
		//why is it more complicated?? 
		//1. objects are more complex (they include features and behaviors)
		//2. runtime polymorphism happens.
		
		
		
		
	}

}
