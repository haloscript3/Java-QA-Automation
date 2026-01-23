package com.lesson13;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		String filePath = System.getProperty("user.dir") + "/screenshots/dashboard.png";

		// enter the file location into the file upload element
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);

		wait(3);

		// click on upload button
		click(driver.findElement(By.xpath("//button")));

		// after clicking the upload button, an alert pops up
		// print the message inside the alert
		System.out.println("Alert message: " + getAlertText());

		// accept the alert
		acceptAlert();

		// take a screenshot of the page
		takeScreenshot("file-upload-result.png");

		tearDown();

	}

}
