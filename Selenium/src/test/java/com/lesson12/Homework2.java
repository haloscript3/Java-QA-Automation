package com.lesson12;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Homework2 extends CommonMethods {
	// WindowHandleDemo at com.neotech.lesson07 using the CommonMethods.java
	// https://accounts.google.com/signup
	public static void main(String[] args) {

		setUp();

		System.out.println("Title ---> " + driver.getTitle());

		System.out.println("Window Handle ---> " + driver.getWindowHandle());

		wait(3);

		click(driver.findElement(By.linkText("Help")));

		switchToChildWindow();
		wait(3);

		String title2 = driver.getTitle();
		System.out.println("Title 2 : " + title2);

		// how do i close the second window?
		driver.close();
		wait(3);

		tearDown();

	}

}
