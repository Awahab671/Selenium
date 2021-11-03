package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");   // for windows add .exe
        WebDriver driver = new ChromeDriver();       // We are launching the chrome browser.
        driver.get("https://www.amazon.com");
        String title=  driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
