package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.name("ctl00$MainContent$login_button"));
        login.click();
        String title=  driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Correct");

        }else{
            System.out.println("wrong");
        }
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Logout")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
