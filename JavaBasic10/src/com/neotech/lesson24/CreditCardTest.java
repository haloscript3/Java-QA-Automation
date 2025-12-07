package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {

		CreditCard card1 = new CreditCard(5000);
		card1.calculateInterest();

		CreditCard card2 = new AX(7000); // up-casting
		card2.calculateInterest();

		CreditCard card3 = new Visa(15000); // up-casting
		card3.calculateInterest();
		// card3.cashBack();

		// How do i get the cashBack() behavior?
		Visa card4 = new Visa(2500);
		card4.cashBack();

		// by down-casting
		Visa card5 = (Visa) card3;
		card5.cashBack();


		CreditCard[] cards = { card1, card2, card3, card4, card5, new AX(4500) };

		for (CreditCard card : cards) {
			card.calculateInterest();
		}
	}

}
