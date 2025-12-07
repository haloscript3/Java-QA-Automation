package com.neotech.lesson30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework3 {
	// Create a Set collection that will hold Objects of Student Type.
	// In this set we do not care about the insertion order.
	// Each student object should have name and studentID.
	// Display name of each student.
	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();

		Student s1 = new Student("Cem", 1);

		students.add(s1);
		students.add(new Student("Halil", 2));
		students.add(new Student("Ozzy", 3));
		students.add(new Student("Alisan", 4));

		// advanced for loop
		for (Student student : students) {
			System.out.println(student.getStudentId() + " --> " + student.getName());
		}

		System.out.println("-------------");

		// Iterator
		Iterator<Student> it = students.iterator();

		while (it.hasNext()) {
			Student currentStudent = it.next();

			System.out.println(currentStudent.getStudentId() + " --> " + currentStudent.getName());

			// will it print the id and name of the student? NO
			// every .next() call will move the cursor to the next item
			// System.out.println(it.next().getStudentId() + " --> " + it.next().getName());
		}
	}

}

class Student {
	private String name;
	private int studentId;

	// once we have our own constructor, the default constructor is revoked
	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	public String getName() {
		return this.name;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setName(String name) {
		this.name = name;
	}
}