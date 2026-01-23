package com.lesson13;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {
	// https://the-internet.herokuapp.com/
	public static void main(String[] args) {

		setUp();

		click(driver.findElement(By.linkText("File Upload")));

		// Keep in mind that; Selenium CANNOT control the file explorer
		// To upload a file, we have to send the file path to the file upload input
		// element

		String filePath = System.getProperty("user.dir") + "/screenshots/dashboard.png";

		wait(2);

		sendText(driver.findElement(By.id("file-upload")), filePath);

		wait(2);

		click(driver.findElement(By.id("file-submit")));

		wait(3);

		tearDown();

	}

}
