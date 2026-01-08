package com.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class Task1 extends BaseClass {
	/*
	 
	-- Verify element is present --
	Open chrome browser
	Go to "https://the-internet.herokuapp.com/"
	Click on the "Dynamic Loading" link
	Click on "Example 1..." and click on "Start"
	Verify element with text "Hello World!" is displayed
	Close the browser 
	
	*/
	public static void main(String[] args) {

		setUp();

		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();

		driver.findElement(By.tagName("button")).click();

		// after clicking the button, page waits for a while
		// create a wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));

		WebElement message = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		System.out.println(message.getText());
		System.out.println(message.isDisplayed());

		tearDown();

	}

}
