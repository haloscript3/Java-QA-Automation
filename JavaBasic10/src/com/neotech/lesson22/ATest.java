package com.neotech.lesson22;

public class ATest {

	public static void main(String[] args) {

		A a = new A();
		a.method();
		
		C c = new C();
		
		c.method();
		System.out.println(c.name);
		System.out.println(c.lastName);
		
		
	}

}
