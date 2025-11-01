package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.firstName = "Oguzhan";
		s1.lastName = "Yesildag";
		s1.age = 24;
		s1.gender = 'M';
		s1.school = "NeoTech Academy";
		s1.grade = 1;

		s1.study();
		s1.doHomework();
		s1.attendClass();

		System.out.println("------------------");

		Student s2 = new Student();
		s2.firstName = "Maya";
		s2.lastName = "Celikcan";
		s2.age = 31;
		s2.gender = 'F';
		s2.school = "NeoTech Academy";
		s2.grade = 1;

		s2.study();
		s2.doHomework();
		s2.attendClass();

		System.out.println("------------------");

		// can i call the same method as many times as i need?
		s2.study();
		s2.doHomework();

	}

}
