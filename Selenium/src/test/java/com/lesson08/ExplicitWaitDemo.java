package com.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {
	// https://neotech.vercel.app/waits
	public static void main(String[] args) {

		setUp();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));

		// here we are sure that the element is visible in page
		WebElement button1 = driver.findElement(By.id("button1"));

		System.out.println("Button1 is displayed: " + button1.isDisplayed());

		button1.click();

		tearDown();

	}

}
