package com.neotech.lesson24;

public class StudentTest {

	public static void main(String[] args) {

		System.out.println("----Student Object----");
		Student st1 = new Student();
		st1.study();
		st1.doHomework();

		System.out.println("\n----Neotech Student Object----");
		NeotechStudent st2 = new NeotechStudent();
		st2.study();
		st2.doHomework();
		st2.getJob();

		System.out.println("\n----Different Student Objects----");
		Student s1, s2, s3;
		s1 = new NeotechStudent(); // up-casting
		s2 = new CollegeStudent(); // up-casting
		s3 = new SchoolStudent(); // up-casting

		System.out.println("----------------");
		s1.study(); // runtime polymorphism: treat child as its parent
		// s1.getJob() // not allowed since Student does not have this behavior

		s2.study();

		s3.doHomework();
	}

}
