package com.review03;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		//WebDriverWait example
		
		
		driver.findElement(By.id("btnStart")).click();
		
		//Since this is a special situation, then I will design an explicit wait for this item
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
		
		Thread.sleep(2000);
		
		
		
		//FluentWait example 
		
		driver.findElement(By.id("btnStartDownload")).click();
		
	//	Thread.sleep(30000); //with this, the code would work, but its a useless wait. Not practical 
		
		
		FluentWait<WebDriver> fluentWait = new FluentWait(driver);
		fluentWait.withTimeout(Duration.ofSeconds(30));
		fluentWait.pollingEvery(Duration.ofSeconds(2));
		fluentWait.ignoring(NoSuchElementException.class);
		
		
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(2000);
		
		tearDown();

	}

}
