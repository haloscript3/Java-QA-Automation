package com.lesson11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {
	// https://www.facebook.com/r.php
	public static void main(String[] args) {

		setUp();

		selectDropdown(driver.findElement(By.id("month")), "May");

		wait(2);

		selectDropdown(driver.findElement(By.id("day")), 23);

		wait(2);

		selectDropdown(driver.findElement(By.id("year")), "2000");

		wait(2);

		tearDown();

	}

}
