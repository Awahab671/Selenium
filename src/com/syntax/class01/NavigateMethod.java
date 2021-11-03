package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back(); // it will go back to previous page.
        driver.navigate().forward(); // it will go forward.
        Thread.sleep(2000);  // it pauses the program for two seconds.
        driver.navigate().refresh();  // it refreshes the program.
        driver.close();  // close closes the current page.
        driver.quit();  // quit closes the whole browser page.

    }
}
