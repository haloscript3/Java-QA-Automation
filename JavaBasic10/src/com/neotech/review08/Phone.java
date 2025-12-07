package com.neotech.review08_encapsulation;

public class Phone {
	private String serialNumber;
	private String brand;
	private String password;

	public Phone(String serialNumber, String brand, String password) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;
	}

	public void displayInfo() {
		System.out.println("This is a " + this.brand + " phone with serial number " + this.serialNumber);
	}

	// Getters and Setters

	// This method will return the serialNumber
	// ONLY if you provide the correct password
	public String getSerialNumber(String password) {

		if (this.password.equals(password)) {
			return serialNumber;
		} else {
			return "Access Denied!!!";
		}
	}

	// This method will change/reassign the serialNumber
	// ONLY if it 7 characters long
	public void setSerialNumber(String serialNumber) {

		if (serialNumber.length() == 7)
			this.serialNumber = serialNumber;
	}

	// Brand should be view ONLY
	public String getBrand() {
		return this.brand;
	}

	// Password is hidden
	// No Getter, No Setter
}
