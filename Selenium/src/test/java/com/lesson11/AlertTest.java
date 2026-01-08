package com.lesson11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertTest extends CommonMethods {
//https://neotech.vercel.app/delete-customer
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// send text to customer id box
		sendText(driver.findElement(By.id("customerId")), "123");

		// click on delete button
		driver.findElement(By.id("btnDeleteCustomer")).click();

		wait(2);

		// an alert pops up here so we have to handle it:
		// dismiss the alert
		dismissAlert();

		wait(2);


		// lets show another alert
		driver.findElement(By.id("btnDeleteCustomer")).click();
		wait(2);
		acceptAlert();

		// another alert popped up so we have to handle it
		System.out.println(getAlertText());
		acceptAlert();
		wait(2);

		tearDown();

	}

}
