package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "Woody";
		dog1.age = 3;
		dog1.displayInfo();

		Dog dog2 = new Dog();
		dog2.name = "Bugsy";
		dog2.age = 2;
		dog2.displayInfo();

		System.out.println("--------------");

		Dog.breed = "Sheppard";
		Dog.paws = 5;

		dog1.displayInfo();
		dog2.displayInfo();

		Dog dog3 = new Dog();
		dog3.displayInfo();

	}

}
