package com.neotech.review01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestParameters {

	@Test(priority = 2, groups = { "smoke", "regression" })
	public void methodA() {
		System.out.println("-> Running Test Method A");
	}

	@Test(priority = 0, enabled = false, groups = "smoke")
	public void methodB() {
		System.out.println("-> Running Test Method B");
	}

	@Test(priority = 2)
	public void methodC() {
		System.out.println("-> Running Test Method C");
	}

}
