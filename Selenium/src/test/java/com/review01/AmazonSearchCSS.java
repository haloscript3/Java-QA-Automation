package com.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchCSS {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.amazon.com/";
		driver.get(url);

		Thread.sleep(2000);

		// # (hashtag) means id
		// input#twotabsearchtextbox -> any input with id = twotabsearchtextbox
		// #twotabsearchtextbox -> any element with id = twotabsearchtextbox

		// . (period) means class
		// div.nav-search-field -> any div with class = nav-search-field
		// .nav-search-field ->. any element with class = nav-search-field

		WebElement searchText = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchText.sendKeys("Turkey");

		// span#nav-search-submit-text > input
		// Locate the span with id = nav-search-submit-text
		// Locate the direct-child input

		// Method chaining: locating the WebElement and clicking on it
		driver.findElement(By.cssSelector("span#nav-search-submit-text > input")).click();

		Thread.sleep(5000);
		driver.quit();
	}
}
