package com.neotech.lesson26;

public class Doctor {

	private long licenceId;
	private String phone, email;

	// getter for licenseId
	public long getLicenseId() {
		return this.licenceId;
	}

	// getter for phone number
	public String getPhone() {
		return this.phone;
	}

	// getter for email
	public String getEmail() {
		return this.email;
	}

	// setter for licenceId
	public void setLicenseId(long licenseId) {
		this.licenceId = licenseId;
	}

	// setter for phone
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// setter for email
	public void setEmail(String email) {
		if (!email.isEmpty()) {
			if (email.contains("@gmail.com")) {
				this.email = email;
			} else {
				System.out.println("Only gmail accounts are accepted!");
			}
		} else {
			System.out.println("Email can not be blank!!!");
		}
	}
}
