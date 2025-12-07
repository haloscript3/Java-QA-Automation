package com.neotech.lesson23;

public class ParentChildTest {

	public static void main(String[] args) {

		Parent p = new Parent();
		// p.hello(); -> wont work because hello() is a private method

		Parent.bye();

		System.out.println("-------------");

		Child c = new Child();
		// c.hello();

		Child.bye();
	}

}
