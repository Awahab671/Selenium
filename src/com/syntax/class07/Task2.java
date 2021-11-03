package com.syntax.class07;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static String url;
    public static void main(String[] args) {
        /*HW
navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console*/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        url= "http://www.uitestpractice.com/Students/Contact";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement linkText = driver.findElement(By.linkText("This is a Ajax link"));
        linkText.click();
        linkText.getText();


    }
}
