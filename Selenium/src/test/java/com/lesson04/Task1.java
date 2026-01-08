package com.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static String url = "https://neotech.vercel.app/web-orders";
	public static String username = "Tester";
	public static String password = "test";
	
	public static void main(String[] args) throws InterruptedException {

	/*
	 	Open chrome browser
		Go to "https://neotech.vercel.app/web-orders"
		Enter valid username and password
		Click on login button
		Then verify "Web Orders" is displayed and also username is displayed right top corner
	 */
		
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		
		//go to the url 
		driver.get(url);
		
		//login 
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		
		
		
		//verify Web Orders
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
		
		if (header.isDisplayed())
		{
			System.out.println("The header - " + header.getText() + " - is displayed!" );
		}
		else
		{
			System.out.println("The header is NOT displayed!");
		}
		
		//verify username 
		
		String loginText = driver.findElement(By.cssSelector("#account-name")).getText();
		
		if (loginText.toLowerCase().contains("neotech"))  //we can convert the text to lowercase and check for the lowercase
		{
			System.out.println("Login was successful!");
		}
		else
		{
			System.out.println("Login failed!");
		}
		
		
		
		//quit the browser
		driver.quit();
		
	}

}
