package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {

		Animal obj1 = new Animal();
		obj1.eat();
		obj1.sleep();
		// obj1.run(); // not allowed since it does not belong to Animal class

		// casting from int to double
		int i = 10;
		double j = i;

		System.out.println("----------------");

		// tiger is an animal: Safe
		Animal obj2 = new Tiger();
		obj2.eat(); // the eat() method will be determined at run time
		obj2.sleep();
		// obj2.run(); //compile time error

		System.out.println("----------------");

		// I guess, this animal is a tiger: Risky
		Tiger obj3 = (Tiger) obj2;
		obj3.eat();
		obj3.sleep();
		obj3.run();

		// dog is an animal: Safe
		// here obj4 can eat, sleep but not bark
		Animal obj4 = new Dog();
		obj4.eat();
		obj4.sleep();
		// obj4.bark();

		// down-casting to a Dog is ok, but down-casting to a Tiger will give runtime
		// error
		Dog obj5 = (Dog) obj4;
		obj5.bark();

//		Dog obj4 = (Dog) obj2;
//		obj4.eat();
//		obj4.sleep();
//		obj4.bark();
	}

}
