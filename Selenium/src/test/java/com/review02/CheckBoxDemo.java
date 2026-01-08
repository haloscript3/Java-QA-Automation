package com.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class CheckBoxDemo extends BaseClass {
	// Go to https://demoqa.com/automation-practice-form
	// Check Female
	// Select all the Hobbies

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		// Cannot click on the input, because the label does not allow
		// driver.findElement(By.id("gender-radio-2")).click();

		// We are able to click on the label
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(1000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		// It will return the first WebElement with that xPath
//		WebElement element = driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
//		
//		// It will return all the WebElements with that xPath
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		findElement() vs findElements()
//		
//		1. If xPath is wrong
//		findElement() -> will throw an Exception
//		findElements() -> will return an Empty List of WebElements (size=0)
//
//		2. If there are multiple WebElements with that xPath
//		findElement() -> will return the first WebElement
//		findElements() -> will return all the WebElements inside a List (size=3)
//		
//		3. If there is only one WebElement with that xPath
//		findElement() -> will return the WebElement
//		findElements() -> will return the WebElement inside a List (size=1)
//		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Locate all the checkboxes
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		// Iterate and click all the checkBoxes one-by-one
		for (WebElement checkBox : checkBoxList) {
			checkBox.click();
			Thread.sleep(2000);
		}

		tearDown();
	}

}
