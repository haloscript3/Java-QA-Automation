package com.neotech.lesson21;

public class Barn {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.name = "Pinky";
		a1.color = "pink";
		a1.age = 2;
		a1.weight = 7;
		// a1.breed = "husky"; -> breed belong to Dog, not Animal class

		a1.eat();
		a1.sleep();
		a1.displayInfo();
		// a1.bark(); bark method belong to Dog, not Animal class

		System.out.println("--------------------");

		Dog d1 = new Dog();
		d1.name = "Sparrow"; // inherits from parent(Animal)
		d1.color = "Black";// inherits from parent(Animal)
		d1.age = 5;// inherits from parent(Animal)
		d1.weight = 25;// inherits from parent(Animal)
		d1.breed = "Sheppard"; // Dog specific property

		d1.eat(); // inherits from parent(Animal)
		d1.sleep();// inherits from parent(Animal)
		d1.displayInfo();// inherits from parent(Animal)
		d1.bark();// Dog specific behavior

	}

}
