package com.neotech.review07;

public class Dermatologist extends Doctor{

	String dermID;
	
	Dermatologist()
	{
		super(); //the default super constructor is explicitly called
	}

	Dermatologist(String name, int salary, String licenseID, String dermID) {
		super(name, salary, licenseID);
		//super.name = name;
		//super.salary = salary;
		this.dermID = dermID;
	}


	public void applySkinTreatment()
	{
		System.out.println("Doctor " + name + " applies skin treatment!");
	}
}
