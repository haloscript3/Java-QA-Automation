package com.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class MultiSelectDropdown extends BaseClass {
	// https://neotech.vercel.app/select
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// locate the dropdown web element
		WebElement multiSelectElement = driver.findElement(By.id("multi-select"));

		// create a Select object from the web element
		Select multiSelect = new Select(multiSelectElement);

		// check if the select object is multi-select
		boolean isMultiSelect = multiSelect.isMultiple();
		System.out.println("Drop down is multi select: " + isMultiSelect);

		if (isMultiSelect) {
			List<WebElement> options = multiSelect.getOptions();

			for (WebElement option : options) {
				String text = option.getText();
				System.out.println("The visible text is " + text);

				multiSelect.selectByVisibleText(text);
				Thread.sleep(1000);
			}
		}

		// de-select the first option
		multiSelect.deselectByIndex(0);
		Thread.sleep(2000);

		multiSelect.deselectAll();
		Thread.sleep(2000);

		tearDown();

	}

}
