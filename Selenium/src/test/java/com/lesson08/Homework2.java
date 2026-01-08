package com.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class Homework2 extends BaseClass {
	/*
	 
	1) Launch the browser and open the site "https://neotech.vercel.app/iframe/multi2"
	2) Verify on the page header "Not a Friendly Topic" displayed
	3) Click on the Inner Frame Check box
	4) Choose Dog from Animals dropdown
	5) Quit the browser
	 
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp();

		String label = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(label);
		System.out.println(label.equals("Not a Friendly Topic"));

		// switch into the parent frame
		driver.switchTo().frame("nested1");

		// switch into the child frame
		driver.switchTo().frame("child-frame");

		Thread.sleep(2000);

		// click on the checkbox
		driver.findElement(By.id("inner-frame-check-box")).click();

		Thread.sleep(3000);

		// switch back to the main content
		driver.switchTo().defaultContent();

		// switch into the animals frame
		driver.switchTo().frame("animals");

		// create a Select object and select Dog
		Select animalsDd = new Select(driver.findElement(By.id("animal-select")));
		animalsDd.selectByVisibleText("Dog");

		Thread.sleep(3000);

		tearDown();

	}

}
