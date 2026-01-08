package com.review02;

import org.openqa.selenium.By;
import com.utils.BaseClass;

public class Test2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Prepare for the test
		// open browser
		// maximize
		// go to facebook.com
		setUp();

		// Do our test
		// Locate some elements
		// Click on buttons
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ciara@neotech.com");
		Thread.sleep(2000);

		// Clean up everything
		tearDown();

	}

}
