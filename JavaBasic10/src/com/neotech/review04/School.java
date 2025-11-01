package com.neotech.review04;

public class School {

	public static void main(String[] args) {

		// School s = new School();

		Student student1 = new Student();
		student1.name = "Biden";
		student1.studentNr = 46;
		student1.gradeLevel = 5;

		Student student2 = new Student();
		student2.name = "Trump";
		student2.studentNr = 47;
		student2.gradeLevel = 4;

		Teacher teacher = new Teacher();
		teacher.name = "Mercedes";
		teacher.salary = 120000;
		teacher.subject = "Java";

		// Re-assigning the subject
		teacher.subject = "ELA";
		
		System.out.println("Let's call the methods!");
		
		student2.study();
		
		student1.sleep();
		student2.sleep();
		
		teacher.teach();
		teacher.yellAtStudent("Leonardo");

	}

}
