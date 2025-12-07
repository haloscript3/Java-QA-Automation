package com.neotech.lesson23;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.salary = 123444;
		emp.getPaid();

		System.out.println("--------------");

		Contractor c = new Contractor();
		c.hourlyRate = 50;
		c.getPaid();

		System.out.println("--------------");

		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 145000;
		ft.getPaid();

	}

}
