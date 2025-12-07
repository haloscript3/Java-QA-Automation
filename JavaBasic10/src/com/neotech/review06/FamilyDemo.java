package com.neotech.review06;

public class FamilyDemo {

	public static void main(String[] args) {
		// I CAN access static/class variables before I create an object
		FamilyMember.lastName = "Messi";

		// I CANNOT access instance variables before I create an object
		// FamilyMember.firstName = "Lionel";

		// I CAN access static/class methods before I create an object
		FamilyMember.printFamilyName();

		// I CANNOT access instance methods before I create an object
		// FamilyMember.printFullName();

		System.out.println("--------------------------------");

		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Lionel";
		member1.age = 38;

		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Antonella";
		member2.age = 33;

		member1.printFullName();
		member2.printFullName();

		System.out.println("--------------------------------");
		System.out.println("They decided to change their lastname!!!");

		// Static variables CAN change
		FamilyMember.lastName = "GOAT";
		member1.firstName = "Leo";

		member1.printFullName();
		member2.printFullName();

		System.out.println("--------------------------------");

		// They are making a baby
		FamilyMember baby = new FamilyMember();

		// Does the baby have a firstName?
		System.out.println("Baby firstname -> " + baby.firstName);
		
		// Does the baby have a lastName?
		System.out.println("Baby lastName -> " + FamilyMember.lastName);
		
		baby.printFullName();
	}

}
