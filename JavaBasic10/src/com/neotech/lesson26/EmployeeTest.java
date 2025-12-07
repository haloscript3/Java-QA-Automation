package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		// name property is private so it can not be accessed directly
		// emp1.name = "Alisan";

		emp1.setName("Alisan");
		emp1.setAge(30);
		emp1.setSalary(120000);

		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getSalary());

	}

}
