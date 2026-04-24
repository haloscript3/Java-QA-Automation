package com.neotech.review01;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

	@Test
	public void hardAssertTest() {

		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");

		String expectedAccount = "Jacqueline";
		String actualAccount = "Aaron";

		AssertJUnit.assertEquals(actualAccount, expectedAccount, "The account is wrong!");

		// After Hard Assert fails, the Test Method will stop executing

		System.out.println("Step4");
	}

	@Test
	public void softAssertTest() {

		SoftAssert soft = new SoftAssert();

		System.out.println("Step1");

		String expectedGOAT = "Ronaldo";
		String actualGOAT = "Messi";

		AssertJUnit.assertEquals(actualGOAT, expectedGOAT); // This assertion will fail

		System.out.println("Step2");

		AssertJUnit.assertTrue(true); // This assertion will pass

		System.out.println("Step3");

		AssertJUnit.assertEquals(960, 1000); // This assertion will fail

		// This assertAll() method will collect all soft assertions
		// And will decide if the Test Method will pass or fail
		// If all assertions pass, the Test Method will pass
		// If one of the assertions fails, the Test Method will fail
		soft.assertAll();

		System.out.println("Step4");
	}

}
