package com.neotech.lesson25;

public interface WebDriver1 {
    /*
    * Homework 1:
    Create a WebDriver Interface that will have the following unimplemented behaviour:
	   openBrowser(),
	   closeBrowser(),
	   maximizeWindow(),
	   findElement().

    Create another interface named Camera that will have the method:
	   takePicture();
    Create 2 classes that implements WebDriver and Camera interfaces: ChromeDriver and FirefoxDriver.*/

         void openBrowser();
         void closeBrowser();
         void maximizeWindow();
         void findElement();
}
  interface Camera{
    void takePicture();
}
class ChromeDriver implements WebDriver1, Camera{
    @Override
    public void openBrowser() {
        System.out.println("Chrome opens browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Chrome closes browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Chrome maximize window");
    }
    @Override
    public void findElement() {
        System.out.println("Chrome finding elements . . .");
    }
    @Override
    public void takePicture() {
        System.out.println("Chrome takes picture");
    }
}
class FirefoxDriver implements WebDriver1, Camera{
    @Override
     public void openBrowser() {
        System.out.println("Firefox opens browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Firefox closes browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Firefox maximize window");
    }
    @Override
    public void findElement() {
        System.out.println("Firefox finding elements . . .");
    }
    @Override
    public void takePicture() {
        System.out.println("Firefox takes picture");
    }
}