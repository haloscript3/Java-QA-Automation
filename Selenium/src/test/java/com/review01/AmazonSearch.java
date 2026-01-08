package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);

		Thread.sleep(2000);

		// WebElement elementById = driver.findElement(By.id("twotabsearchtextbox"));
		// elementById.sendKeys("Bakllava");

		// WebElement elementByName = driver.findElement(By.name("field-keywords"));
		// elementByName.sendKeys("Bakllava");

		// There are 8 locators to find the elements in the DOM
		// id, name, className, tagName, linkText, partialLinkText, xPath, cssSelector

		WebElement searchText = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchText.sendKeys("Bakllava");

		// You have to be careful when you locate the elements
		// Using the xPath below, it will find 2 elements in the DOM
		// input[@class='nav-input nav-progressive-attribute']

		// Anywhere in the DOM, find an INPUT
		// The input has attribute ID='nav-search-submit-button'
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();

		Thread.sleep(5000);
		driver.quit();
	}

}
