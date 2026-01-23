package com.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class Homework1 extends CommonMethods {
	/*
	Open chrome browser
	Go to https://demo.guru99.com/test/drag_drop.html
	Drag the following blocks in different ways
	Drag BANK to DEBIT SIDE
	Drag SALES to CREDIT SIDE
	Drag 5000 to DEBIT SIDE
	Drag 5000 to CREDIT SIDE
	Close the browser 
	
	*/
	public static void main(String[] args) {

		setUp();

		Actions action = new Actions(driver);

		// Drag BANK to DEBIT SIDE

		// locate the BANK element
		WebElement bank = driver.findElement(By.id("credit2"));

		// locate the debit side element
		WebElement debitSide = driver.findElement(By.id("bank"));

		// drag bank element into debitSide element
		action.dragAndDrop(bank, debitSide).perform();

		wait(2);

		// Drag SALES to CREDIT SIDE

		// locate the sales element
		WebElement sales = driver.findElement(By.id("credit1"));

		// locate the credit side element
		WebElement creditSide = driver.findElement(By.id("loan"));

		// drag sales element into credit side element
		// action.dragAndDrop(sales, creditSide).perform();
		action.clickAndHold(sales).moveToElement(creditSide).release().perform();

		wait(2);

		// Drag 5000 to DEBIT SIDE

		// locate the 5000 element
		WebElement fiveThousand1 = driver.findElement(By.xpath("//li[@id='fourth'][1]"));

		// locate the debitSide for 5000
		WebElement debitSide2 = driver.findElement(By.id("amt7"));

		// drag 5000 element into debit side
		action.dragAndDrop(fiveThousand1, debitSide2).perform();

		wait(2);

		// Drag 5000 to CREDIT SIDE

		// locate the 5000 element
		WebElement fiveThousand2 = driver.findElement(By.xpath("//li[@id='fourth'][2]"));

		// locate the credit side for 5000
		WebElement creditSide2 = driver.findElement(By.id("amt8"));

		action.dragAndDrop(fiveThousand2, creditSide2).perform();

		wait(2);

		// verify Perfect! shows in page
		if (driver.findElement(By.linkText("Perfect!")).isDisplayed()) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}

		wait(3);

		tearDown();

	}

}
