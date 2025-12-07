package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {

		Doctor d1 = new Doctor();
		d1.setEmail("d1@gmail.com");
		d1.setLicenseId(23234);
		d1.setPhone("(555) 123 4567");

		System.out.println(d1.getEmail());
		System.out.println(d1.getLicenseId());
		System.out.println(d1.getPhone());

	}

}
