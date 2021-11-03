package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.syntaxprojects.com");
        driver.manage().window().maximize();
        WebElement startPracticing= driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        startPracticing.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("I am learning Selenium.");
        WebElement showmessage = driver.findElement(By.xpath("//button[text()= 'Show Message']"));
        showmessage.click();
        Thread.sleep(1000);
        driver.quit();


    }
}
