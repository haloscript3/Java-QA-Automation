package com.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class Homework3 extends BaseClass {
	/*	        Add Employee
	Open chrome browser
	Go to "https://hrm.neotechacademy.com/"
	Login into the application
	Click on PIM > Add Employee 
	Add Employee
	Log out 
	Quit the browser*/
	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Neotech@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// expand the PIM menu
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		// click on Add Employee link
		driver.findElement(By.linkText("Add Employee")).click();

		// there are some waiting here
		// so i will wait until the modal is loaded and the first name box is visible
		WebDriverWait firstNameBoxWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		firstNameBoxWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name-box")));

		// fill in the employee details
		driver.findElement(By.id("first-name-box")).sendKeys("John");
		driver.findElement(By.id("last-name-box")).sendKeys("Doe");

		WebElement locationElement = driver.findElement(By.xpath("//div[text() = '-- Select --']"));
		locationElement.click();
		driver.findElement(By.linkText("France Regional HQ")).click();

		Thread.sleep(2000);

		// click on the save button
		driver.findElement(By.id("modal-save-button")).click();

		// create a new wait object for Personal Details page
		WebDriverWait personalDetailsWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		personalDetailsWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("personal_details_tab")));

		Thread.sleep(2000);

		// logout
		driver.findElement(By.id("user-dropdown")).click();
		driver.findElement(By.id("logoutLink")).click();

		Thread.sleep(3000);

		tearDown();

	}

}
