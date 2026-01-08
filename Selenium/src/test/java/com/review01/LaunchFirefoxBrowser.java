package com.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		// This code will open the Mozilla Firefox Browser
		WebDriver driver = new FirefoxDriver();

		String url = "https://www.nytimes.com/games/wordle/";

		// It will navigate to a specific website
		driver.get(url);

		// Wait for 2 seconds
		Thread.sleep(2000); // 2 seconds

		String currentURL = driver.getCurrentUrl();

		if (url.equals(currentURL)) {
			System.out.println("URLs are the same!");
		} else {
			System.out.println("URLs are different!");
		}

		System.out.println("1 -> " + url);
		System.out.println("2 -> " + currentURL);

		// Get the website title
		String title = driver.getTitle();
		System.out.println("Title -> " + title);

		// Quit (close) the vrowser
		driver.quit();

	}

}
