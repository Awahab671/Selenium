package com.syntax.class05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDropDown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="https://www.facebook.com";
        driver.manage().window().maximize();
        driver.get(url);


    }
}
