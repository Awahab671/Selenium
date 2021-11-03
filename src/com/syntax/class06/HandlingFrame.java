package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Wahab is doing great!");
        driver.switchTo().defaultContent();
        //WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        //simpleAlertButton.click();
        //The above code was the first way for accessing frames.
        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("Syntax Batch 10");
    }
}
