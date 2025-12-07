package com.neotech.lesson25;

public class ComputerTest {

	public static void main(String[] args) {

		//I can create class specific objects 
		Apple app = new Apple("Apple");
		HP hp1 = new HP("HP", "Purple");

		//what could I do with these objects -- access the object specific features and behaviors (including inherited!!!)
		System.out.println(app.brand);
		app.run();
		app.safe();
		
		System.out.println(hp1.brand);
		hp1.run();
		hp1.save();
		
		//I can create specific objects and assign to their parent class type 
		Computer c1 = new Lenovo("Lenovo");
		Computer c2 = new Dell("Dell");
		
		//What could I do with these objects --- 
		System.out.println(c1.brand);
		c1.run();
		//c1.save();  //we cannot because even though the Lenovo class has this method, c1 is a Computer type (does not have that method) 
					//if I wanted to access that: 
						// (1) I can either create a Lenovo object and assign it to a Lenovo type
						// (2) downcast the c1 to a Lenovo type (since I know its actually a Lenovo object) and then access the save() 
		
		
		
		System.out.println("-------------------------------");
		
		//Since all these objects (Apple, HP, Lenovo, Dell) are Computers, then I can do this: 
			// group them together and put them in an array
		
		
		
		
		//1st way: 
		Computer[] compArray = {c1, c2, app, hp1}; //why can I add app and hp1?? Because they will automatically be up-casted
			//as simple as double[] d = {1, 1.4, 6.5, 7}
		
		
		
		
		
		
		//2nd way: 
		Computer[] compArray2 = {
							new Apple("Apple"), 
							new Lenovo("Lenovo"), 
							new HP("HP", "Red"), 
							new Dell("Dell")
							};
		
		
		
		for (Computer c : compArray2)
		{
			System.out.println(c.brand);
			c.run();
		//	c.save(); //can I say this? I cannot, because that method does not exist in the Computer class
		}
		
		
		
		
		//can I do this?
		//YES, but I can only put Apple object there!!!
		
		Apple[] appleArray = {new Apple("Apple"), new Apple("Apple")};
		
		
	}

}
