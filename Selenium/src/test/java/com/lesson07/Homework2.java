package com.lesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.BaseClass;

public class Homework2 extends BaseClass {
	/*
	 * Alert text verification Open chrome browser Go to https://demoqa.com/ Click
	 * on "Alerts, Frame & Windows" link Click on "Alerts" links on the left side
	 * Click on button to see Alert Verify alert box with text
	 * "You clicked a button" is present Click on 3rd button in the page Verify
	 * alert box with text "Do you confirm action?" is present and click "confirm"
	 * Click on 4 th button in the page and enter your name and click ok. Quit
	 * browser
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(3000);

		// click on the first button
		driver.findElement(By.id("alertButton")).click();

		// the alert is shown
		Alert firstAlert = driver.switchTo().alert();
		System.out.println("First alert text: " + firstAlert.getText());

		Thread.sleep(2000);
		firstAlert.accept(); // clicking OK button

		// click on the third button
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Confirm alert text: " + confirmAlert.getText());
		Thread.sleep(2000);
		confirmAlert.dismiss(); // clicking Cancel button

		// click on the fourth button
		driver.findElement(By.id("promtButton")).click();
		Alert thirdAlert = driver.switchTo().alert();

		thirdAlert.sendKeys("Cem");
		Thread.sleep(2000);
		thirdAlert.accept();
		Thread.sleep(2000);

		tearDown();

	}

}
