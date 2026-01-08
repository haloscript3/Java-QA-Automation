package com.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static String url = "https://neotech.vercel.app/sign-up";
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		//every part of the test, will need to happen between these two lines
		
		
		//go to the url: 
		driver.get(url);
		
		//at this point, I am at the web app, so now the rest of the test steps will begin
		
		
		
		//filling up the form
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Maya");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Cris");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("txtLastName")).clear();
		driver.findElement(By.id("txtLastName")).sendKeys("Test");
		Thread.sleep(2000);
		
		// the proper way, avoiding code redundancy
		
		WebElement phone = driver.findElement(By.cssSelector("#txtPhone"));
		// we can locate it with input#txtPhone, since id is unique we can use just #txtPhone
		
		phone.sendKeys("567-345-2345");
		Thread.sleep(2000);
		phone.clear();
		phone.sendKeys("012-345-6789");
		Thread.sleep(2000);
		
		//Getting the value of an attribute
		String maxLength = phone.getDomAttribute("maxlength");
		//or phone.getAttribute("maxlength");  //possibility to deprecate 
		System.out.println("The value of the max length is: "  + maxLength);
		
		
		WebElement country = driver.findElement(By.name("country"));
		
		//I want to get the value of the class attribute for the country web element
		String countryClass = country.getDomAttribute("class");
		System.out.println("The value of the class attribute is: " + countryClass);
		
		
		
		String headerText = driver.findElement(By.xpath("//div[@id='q19']/h2")).getText();
		
		System.out.println("The header text is: " + headerText);
		
		
		
		
		driver.quit();
		

	}

}
