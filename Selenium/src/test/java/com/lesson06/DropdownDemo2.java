package com.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class DropdownDemo2 extends BaseClass {

	// https://demoqa.com/select-menu
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// locate the select element
		WebElement colorDdElement = driver.findElement(By.id("oldSelectMenu"));

		// create a Select object
		Select colorDd = new Select(colorDdElement);
		colorDd.selectByIndex(1);

		Thread.sleep(2000);

		// locate and click on the modern dropdown
		driver.findElement(By.id("withOptGroup")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Group 1, option 2')]")).click();

		Thread.sleep(2000);

		tearDown();

	}

}
