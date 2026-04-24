package com.neotech.review01;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(dependsOnMethods = "loginMethod")
	public void addEmployeeMethod() {
		System.out.println("-> The add employee Test Method");
	}

	@Test
	public void loginMethod() {
		System.out.println("-> The login Test Method");

		AssertJUnit.assertEquals("A", "B"); // We are failing this test on purpose
	}

}
