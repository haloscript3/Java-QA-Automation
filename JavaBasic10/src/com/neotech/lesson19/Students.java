package com.neotech.lesson19;

public class Students {
	
	/*
	Create a Class called Students 
	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
	▪ Create three objects of the Students Class
	▪ Set the value for studentName, studentID and increment
	the numberOfStudents for each object
	▪ Print out total the number of students
	
	*/
	
	//instance variables - every student will have their own value for these
	String studentName;
	int studentID;
	
	//static variable, only one copy (no matter how many students we create)
	static int numberOfStudents; 

	
	
	
	
	public static void main(String[] args) {
		
		Students st1 = new Students(); 
		st1.studentName = "Maya";
		st1.studentID = 1;
		
		//everytime we create a student we have to increment the numberOfStudents
		//is it possible to do this: 
	//	st1.numberOfStudents++;  //Yes, but would not be the proper form
		
		//The proper form to access any static element is: 
		//ClassName.variableName;
		Students.numberOfStudents++;
		
		//can we do this: 
//		numberOfStudents++; 
		//in this case Yes, 
			// (1) we are inside the same class
			// (2) we do not have any local variables with the same name
		
		
		Students st2 = new Students();
		st2.studentName = "Shekinah";
		st2.studentID = 2;
		
		numberOfStudents++;
		
		
		Students st3 = new Students();
		st3.studentName = "Cris";
		st3.studentID = 3; 
		
		numberOfStudents++;
		
		System.out.println("The total number of students: " + numberOfStudents);
	}
	
}
