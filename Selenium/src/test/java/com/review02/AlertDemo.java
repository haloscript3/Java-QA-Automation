package com.review02;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.BaseClass;

public class AlertDemo extends BaseClass {
	// https://neotech.vercel.app/alerts

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(1000);

		// When the alert is open, we cannot interact with the main page
		// driver.findElement(By.id("btnPrompt")).click();

		// We need to take care of the Alert (JavaScript Pop-up)
		Alert alert = driver.switchTo().alert();

		System.out.println("The text of the alert is -> " + alert.getText());

		alert.accept(); // Click on the OK
		Thread.sleep(1000);

		// After accept/dismiss the alert, we can interact with the main page
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(1000);

		Alert prompt = driver.switchTo().alert();
		Thread.sleep(1000);

		// There are 4 mehtods that we can use
		// prompt.getText(); -> Gets the text from the Alert
		// prompt.sendKeys(); -> Sends text to the Alert
		// prompt.accept(); -> Clicking on OK
		// prompt.dismiss(); -> Clicking on Cancel

		prompt.sendKeys("Maya");
		prompt.accept();

		Thread.sleep(3000);

		tearDown();
	}

}
