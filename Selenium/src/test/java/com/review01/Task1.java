package com.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	// Open Chrome browser
	// Navigate to https://www.selenium.dev/
	// Navigate to https://www.google.com/
	// Go back and forth 10 times.
	// Use a for loop
	// Wait 1 second between each navigation

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().to("https://www.google.com/");

		for (int i = 1; i <= 10; i++) {
			driver.navigate().back();
			Thread.sleep(300);

			driver.navigate().forward();
			Thread.sleep(300);
		}

		driver.quit();
	}

}
