package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.name = "Lulu";
		cat1.weight = 7;
		cat1.color = "white";

		Cat cat2 = new Cat();
		cat2.name = "Comolokko";
		cat2.weight = 5;
		cat2.color = "brown";

		cat1.sayMeow();
		cat1.displayInfo();

		cat2.sayMeow();
		cat2.displayInfo();

		// can i only print the color of the second cat?
		System.out.println(cat2.color);

		System.out.println("---------------------");

		cat1.name = "Indy";
		cat1.displayInfo();
		cat2.displayInfo();

		System.out.println("---------------------");

		Cat.isIndependent = false;

		cat1.displayInfo();
		cat2.displayInfo();

	}

}
