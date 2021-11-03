package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceselenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.getTitle();
        driver.close();
    }
}
