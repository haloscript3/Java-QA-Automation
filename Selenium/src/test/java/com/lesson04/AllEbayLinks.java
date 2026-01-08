package com.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllEbayLinks {

	
	public static String url = "https://www.ebay.com/";
	
	public static void main(String[] args) {

		//Get all the links on the page
		//Print the text of each
		//Print href attribute of each
		//Count the number of links that have text 
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);

		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = 0; 
		
		for (WebElement link : allLinks)
		{
			if (!link.getText().isEmpty())
			{
				System.out.println(link.getText());
				System.out.println(" - href: " + link.getDomAttribute("href"));
				count++;
			}
		}
		
		
		System.out.println("The total number of links is: " + allLinks.size());
		System.out.println("The total number of links with text is: " + count);
		
		
		driver.quit();
		
		
	}

}
