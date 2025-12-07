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

		Cat c1 = new Cat();
		c1.name = "Garfield"; // inherits from parent(Animal)
		c1.color = "Brown";// inherits from parent(Animal)
		c1.age = 3;// inherits from parent(Animal)
		c1.weight = 50;// inherits from parent(Animal)

		c1.eat(); // inherits from parent(Animal)
		c1.sleep(); // inherits from parent(Animal)
		c1.displayInfo(); // inherits from parent(Animal)
		c1.meow(); // Cat specific behavior

		Puppy p1 = new Puppy();
		p1.name = "Cutie";// inherits from grandparent(Animal)
		p1.color = "white";// inherits from grandparent(Animal)
		p1.age = 1;// inherits from grandparent(Animal)
		p1.weight = 10;// inherits from grandparent(Animal)

		p1.breed = "Pomeranian";// inherits from parent(Dog)

		p1.hasTrainer = true; // specific to Puppy

		p1.eat();// inherits from grandparent(Animal)
		p1.sleep();// inherits from grandparent(Animal)
		p1.displayInfo();// inherits from grandparent(Animal)

		p1.bark();// inherits from parent(Dog)

		p1.play();// specific to Puppy

	}

}
