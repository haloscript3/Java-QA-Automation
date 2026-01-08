package com.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {
	// https://neotech.vercel.app/waits
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// implicit wait

		// .findElement() .findElements() immediately try to locate the element
		// if they send the request faster than the element load time, we will get
		// NoSuchElementException

		// If we use implicit wait, we are telling the driver to wait x amount of
		// second before throwing the NoSuchElementException
		// by default, the implicit wait time is 0 seconds

		// we are setting the implicit wait time to 15 seconds
		// this wait will be for every element we try to find until the driver quits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// find the button that shows after five seconds
		WebElement button1 = driver.findElement(By.id("button1"));
		button1.click();

		Thread.sleep(3000);

		tearDown();

	}

}
