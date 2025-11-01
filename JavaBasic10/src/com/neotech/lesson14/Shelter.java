package com.neotech.lesson14;

public class Shelter {
//	Create a class Shelter
//	Create 3 objects of Class Dog (Husky, Bulldog, Labrador) 
//	and initialize the features for each and print a sentence with that information.

	public static void main(String[] args) {

		// I can instantiate objects before assigning values
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();

		// Set the properties of the dog objects
		dog1.age = 3;
		dog1.breed = "Golden Retreiver";
		dog1.color = "Golden";
		dog1.size = "Small";

		dog2.breed = "Beagle";
		dog2.color = "Tricolor";
		dog2.size = "Medium";
		dog2.age = 3;

		dog3.age = 1;
		dog3.size = "Big";
		dog3.color = "Black";
		dog3.breed = "Mastiff";

		// lets call the methods
		dog3.eat();
		dog3.breed();
		dog3.run();

		System.out.println("-------------");

		dog2.run();
		dog2.eat();
		dog2.breed();
		System.out.println("-------------");

		dog1.run();
		dog1.eat();
		dog1.breed();

		System.out.println("-------------");

		dog1.getInfo();

		dog1.age = 7;

		dog1.getInfo();

	}

}
