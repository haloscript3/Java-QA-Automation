package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {

	public static void main(String[] args) {

		Employee.company = "NeoTech";
		
		Employee emp = new Employee();
		
		emp.name = "John";
	//	emp.lastName = "Doe";
	//	emp.salary = 55.5;
	//	emp.ssn = 12345;
		
		//From outside the package I can only access public variables 
		
		emp.method1();
		// from outside the package I cannot access protected (with an exception),
		// default, and private method
//		emp.method2();
//		emp.method3();
//		emp.method4();
		
		
		
		//public elements    --> can be seen from anywhere in the project
		//protected elements --> can be seen only from within the same package (with an exception)
		//default elements   --> can be seen only from within the same package 
		//private elements 	 --> can be seen only form within the same class
		
	}

}
