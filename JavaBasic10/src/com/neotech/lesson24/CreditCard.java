package com.neotech.lesson24;

public class CreditCard {
	/*
	 * ▪ Create a class CreditCard and define two variables, balance and interest. ▪
	 * Create an instance method that will calculate the interest based on the given
	 * balance. ▪ Create 2 subclasses: Visa and AX. In AX class override the method
	 * calculate interest. ▪ Call the method by creating an object of each of the
	 * three classes.
	 */

	double balance, interest;

	// constructor
	public CreditCard(double balance) {
		this.balance = balance;
	}

	public void calculateInterest() {
		this.interest = 5;
		System.out.println("The interest rate is " + this.interest);
	}
}

class Visa extends CreditCard {

	public Visa(double balance) {
		super(balance);

	}

	public void cashBack() {
		System.out.println("Visa has 4% cashback!");
	}

}

class AX extends CreditCard {

	public AX(double balance) {
		super(balance);

	}

	@Override
	public void calculateInterest() {
		if (balance < 5000) {
			this.interest = 4.5;
		} else {
			this.interest = 7.5;
		}

		System.out.println("The interest rate is " + this.interest);
	}
}
