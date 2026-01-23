package com.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Homework1 extends CommonMethods {
	// FrameDemo at com.neotech.lesson07 using the CommonMethods.java
	// https://neotech.vercel.app/iframe
	public static void main(String[] args) {

		setUp();

		switchToFrame(0);

		// locate age box
		WebElement ageBox = driver.findElement(By.id("age"));
		sendText(ageBox, "30");
		wait(3);

		// Can i click any button or link outside the frame? NO
		// We have to move focus back to the main content
		driver.switchTo().defaultContent();

		// 2. Switch into the frame using WebElement
		WebElement frame1 = driver.findElement(By.id("age-frame"));
		switchToFrame(frame1);

		sendText(ageBox, "40");
		wait(3);

		tearDown();

	}

}
