package com.syntax.class07;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static String url;
    public static void main(String[] args) throws InterruptedException {
        /*Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify the title is displayed
Print out the title of the all pages
*/

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        url = "https://demoqa.com/browser-windows";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement NewT = driver.findElement(By.id("tabButton"));
        NewT.click();
        NewT.getText();
        System.out.println(NewT);
        Thread.sleep(1000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
       while (iterator.hasNext()){
           String windowHandle = iterator.next();
           driver.getTitle();
           driver.switchTo().window(windowHandle);
           System.out.println(windowHandle);
       }












    }
}
