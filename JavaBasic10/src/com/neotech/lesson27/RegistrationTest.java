package com.neotech.lesson27;

public class RegistrationTest {

	public static void main(String[] args) {

		Registration r1 = new Registration();

		// will not work: only yahoo email is accepted
		// r1.setEmail("me@mail.com");

		r1.setEmail("me@yahoo.com");
		System.out.println(r1.getEmail());

		r1.setEmail("me@neotech.com");
		System.out.println(r1.getEmail());

		System.out.println("---------------");

		r1.setUsername("ozzy");
		System.out.println(r1.getUsername());

		r1.setUsername("ozzy123");
		System.out.println(r1.getUsername());

		System.out.println("---------------");

		r1.setPassword("Burak123");
		System.out.println(r1.getPassword());

		r1.setPassword("ozzy12345");
		System.out.println(r1.getPassword());

	}

}
