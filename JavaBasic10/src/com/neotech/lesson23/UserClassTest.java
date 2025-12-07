package com.neotech.lesson23;

public class UserClassTest {

	public static void main(String[] args) {

		UserClass uc = new UserClass("Oguzhan", 555333233233L);
		// uc.printDetails(); ->printDetails() belongs to sub-class, not the super class

		UserInfo ui = new UserInfo("Maya", 5552223332L, "Los Angeles, CA");
		ui.printDetails();

		// how can i print uc's name?
		System.out.println(uc.name);

	}

}
