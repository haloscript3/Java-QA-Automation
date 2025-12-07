package com.neotech.review07;

public class HospitalApplication {

	public static void main(String[] args) {

	Doctor d1 = new Doctor("Maya", 200000, "lic001");
	d1.checkUp("John");
		
	//These variable and method belong to the child class..
	//d1.dermID = "ABC";
	//d1.applySkinTreatment();
		
	System.out.println("--------------------------");	
	
	Dermatologist d2 = new Dermatologist(); 
	d2.name = "Cem";
	d2.salary = 200000;
	d2.licenseID = "lic002";
	d2.dermID = "lic003";
	
	
	d2.checkUp("John");
	d2.applySkinTreatment();
	
	
	System.out.println("--------------------------");	
	
	Dermatologist d3 = new Dermatologist("Ozzy", 350000,"lic004" ,"derm001");
	
	d3.checkUp("John");
	d3.applySkinTreatment();
	
	//Question: Can I use this constructor (the Doctor constructor)
	//Dermatologist d4 = new Dermatologist("Burak", 300000, "lic005");
	
	//NO, the constructors are NOT inherited...
	
	}

}
