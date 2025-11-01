package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {

		Employee.company = "NeoTech"; 
		
		Employee emp = new Employee();
		
		emp.name = "John";
		emp.lastName = "Doe";
		emp.salary = 55.5;
		//emp.ssn = 12345; //Error: field is not visible
		//emp.age = 25; //Error: this does not exist 
		
		//within the same package, we can access all types of 
		//variables except PRIVATE (those remain within class) 
		
		
		emp.method1(); //within the same package, we can access the public methods
		emp.method2(); // "			- 			"			-  	"   protected methods
		emp.method3(); // "			-			" 			-	"   default methods 
	//	emp.method4(); // "			-			" we CANNOT access private methods
		
		
	//	emp.method5(); //this is undefined, different issue than emp.method4();
		
		
	}

}
