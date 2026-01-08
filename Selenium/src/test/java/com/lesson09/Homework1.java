package com.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class Homework1 extends BaseClass {
//	Homework 1: Use WebDriverWait
//    Verify element is enabled
//    Open chrome browser
//    Go to "https://the-internet.herokuapp.com/"
//    Click on the "Dynamic Controls" link
//    Click on enable button
//    Enter "Hello" and verify text is entered successfully
//    Close the browser
	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.linkText("Dynamic Controls")).click();

		// wait until the Enable button is visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='input-example']/button")));

		// click on the Enable button
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();

		// locate the input element
		WebElement input = driver.findElement(By.xpath("//form[@id='input-example']/input"));

		// wait until the input box is enabled
		wait.until(ExpectedConditions.elementToBeClickable(input));

		// here i know for sure that the input box is enabled
		input.sendKeys("Hello");

		Thread.sleep(2000);

		tearDown();
	}

}
