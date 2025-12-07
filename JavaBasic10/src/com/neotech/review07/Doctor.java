package com.neotech.review07;

public class Doctor {

	String name;
	int salary;
	String licenseID;
	
	//In case a parametrized constructor is used, you must add the default constructor if you 
	//want to allow a default object creation
	Doctor(){}
	
	Doctor(String name, int salary, String licenseID)
	{
		this.name = name;
		this.salary = salary;
		this.licenseID = licenseID;
	}
	
	public void checkUp(String name)
	{
		System.out.println("Doctor " + this.name + " checks up on " + name);
	}
	
	
	
}
