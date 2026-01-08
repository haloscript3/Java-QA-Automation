package com.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;
import com.utils.ConfigsReader;

public class LoginSIS extends BaseClass {
	// Login to SIS Web Application
	// https://sis.neotechacademy.com/
	// username -> Admin
	// password -> Neotech$123

	// For those that the address doesn't work, use this one:
	// https://neotech.vercel.app/sis-login

	public static void main(String[] args) throws InterruptedException {
		setUp();

		// We are performing our test
		Thread.sleep(2000);

		WebElement username = driver.findElement(By.id("tUsername"));
		username.sendKeys(ConfigsReader.getProperty("username")); // Admin
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.name("tPassword"));
		password.sendKeys(ConfigsReader.getProperty("password")); // Neotech$123
		Thread.sleep(2000);
		
		// The input whose type attribute has a value of 'submit'
		driver.findElement(By.xpath("//input[@type='submit']")).click(); // Method chaining
		Thread.sleep(2000);
		
		tearDown();
	}
}
