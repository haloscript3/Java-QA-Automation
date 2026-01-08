package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	// Go to https://demoqa.com/text-box
	// Fill the form and submit
	// Use xPath or CSS Selector

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/text-box";
		driver.get(url);

		driver.findElement(By.cssSelector("input#userName")).sendKeys("Leonardo Serrano");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("leo@neotech.com");

		// Even though there are 2 elements, we will get the first one in the DOM
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("USA");

		// Find an element by using multiple attributes
		// xpath -> //textarea[@class='form-control' and @id='permanentAddress']
		// css -> textarea[class='form-control'][id='permanentAddress']

		driver.findElement(By.xpath("//textarea[@class='form-control' and @id='permanentAddress']")).sendKeys("Canada");

		Thread.sleep(3000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

		driver.quit();
	}

}
