package com.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class HarryPotterSearch extends BaseClass {
	// Go to https://amazon.com
	// select Books from the search drop-down
	// Type Harry potter
	// And click on Search

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(2000);

		WebElement selectDDElement = driver.findElement(By.id("searchDropdownBox"));
		Select selectObject = new Select(selectDDElement);

		// Print all the option of the drop-down
//		List<WebElement> optionList = selectObject.getOptions();
//		for (WebElement option : optionList) {
//			System.out.println(option.getText());
//		}

		// 3 different ways to select one drop-down option
		// selectObject.selectByIndex(5);
		selectObject.selectByValue("search-alias=stripbooks");
		// selectObject.selectByVisibleText("Books");

		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));

		searchText.sendKeys("James Bond");
		Thread.sleep(1000);
		searchText.clear();
		Thread.sleep(1000);
		searchText.sendKeys("Harry Potter");
		Thread.sleep(1000);

		WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
		searchBtn.submit();

		Thread.sleep(2000);
		tearDown();
	}

}
