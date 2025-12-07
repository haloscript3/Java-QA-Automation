package com.neotech.lesson24;

public class WebDriver {

	public void openBrowser() {
		System.out.println("Open browser!");
	}
}

class ChromeDriver extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open Chrome browser!");
	}

	public void openFast() {
		System.out.println("Chrome opens fast!");
	}
}

class FirefoxDriver extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open Firefox browser!");
	}
}

class EdgeDriver extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open Edge browser!");
	}
}
