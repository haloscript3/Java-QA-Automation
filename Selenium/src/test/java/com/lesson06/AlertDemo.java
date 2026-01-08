package com.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.BaseClass;

public class AlertDemo extends BaseClass {
//https://neotech.vercel.app/delete-customer
	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("customerId")).sendKeys("123");
		driver.findElement(By.id("btnDeleteCustomer")).click();

		// an alert pops up here so we have to handle it:
		// switch into the alert box

		Alert simpleAlert = driver.switchTo().alert();

		// dismiss the alert
		String alertText = simpleAlert.getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		simpleAlert.dismiss(); // clicking the Cancel button

		// lets show another alert
		driver.findElement(By.id("btnDeleteCustomer")).click();
		Alert secondAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		secondAlert.accept(); // clicking the OK button

		// another alert popped up so we have to handle it
		Alert lastAlert = driver.switchTo().alert();
		System.out.println(lastAlert.getText());
		Thread.sleep(2000);

		lastAlert.accept();

		Thread.sleep(2000);

		tearDown();

	}

}
