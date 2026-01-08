package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	
	public static String url = "https://neotech.vercel.app/sign-up";

	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver(); 
		
		driver.get(url);
		
		WebElement maleRB = driver.findElement(By.xpath("//label[@for='male']"));
		maleRB.click();
		
		Thread.sleep(2000);
		
		//one-liner would be: 
		//driver.findElement(By.xpath("//label[@for='male']")).click();
		
		//for example
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		
		
		
		
		WebElement wednesdayCB = driver.findElement(By.xpath("//label[@for='wednesday']"));
		wednesdayCB.click();
		Thread.sleep(2000);
		
		
		//what if we don't want to just click on Wednesday specifically? What if we are doing these clicks
		//based on some input? 
		
		//So, that means I should create a logic, that goes over all the elements and clicks based on their text!!!
		
		
		
		//Find a locator that describes the elements you need
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inline_grid choices']/label"));
		
		//elements contains all 9 elements (2 radio buttons and 7 checkboxes)
		
		//Let us assume I want to click on Male RB, and Monday, Saturday
		
		for (WebElement el : elements)
		{
			String text = el.getText();
			
			
			if(text.equals("Male") || text.equals("Monday") || text.equals("Saturday"))
			{
				el.click();
				
				//lets slow it down for us to see: 
				Thread.sleep(2000);
			}
			
		}
		
		
		
		
		
		
		
		
		driver.quit();
		

	}

}
