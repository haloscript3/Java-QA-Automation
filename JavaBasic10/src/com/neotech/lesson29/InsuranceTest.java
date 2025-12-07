package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {

		ArrayList<Insurance> insurances = new ArrayList<>();

		insurances.add(new CarInsurance("Geico", "Mercedes"));
		insurances.add(new PetInsurance("PetPro", "Cat"));
		insurances.add(new HealthInsurance("Delta"));

		// loop over the items of the array list using adv for loop
		for (Insurance insurance : insurances) {
			insurance.getQuote();
			insurance.cancelInsurance();
		}

		System.out.println("--------------");

		// loop over the items of the array list using an iterator object
		Iterator<Insurance> it = insurances.iterator();

		while (it.hasNext()) {
			Insurance insurance = it.next();

			insurance.getQuote();
			insurance.cancelInsurance();
		}

	}

}
