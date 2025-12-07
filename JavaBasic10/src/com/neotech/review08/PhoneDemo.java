package com.neotech.review08_encapsulation;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone p = new Phone("S12345", "Apple", "Pass@123");
		p.displayInfo();

		// Not able to access the password from this class
		// p.password = "NewPassword";

		// Cannot get the serialNumber, because it is private
		// String ser = p.serialNumber;

		String serial = p.getSerialNumber("Pass@123");
		System.out.println("The serial number is " + serial);

		p.setSerialNumber("S123");
		p.displayInfo(); // Did NOT change

		p.setSerialNumber("Georgia");
		p.displayInfo(); // Changed

		System.out.println("--------------------------------");

		System.out.println("The brand is -> " + p.getBrand());

		// We cannot change the brand
		// because the is NO setter method
		// p.setBrand("Samsung");
		
		// Password is hidden. No Getter, No Setter
	}

}
