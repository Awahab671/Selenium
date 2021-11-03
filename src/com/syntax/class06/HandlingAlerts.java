package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.WebEndpoint;

public class HandlingAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert(); // switching our focus to Alert
        Thread.sleep(1000);
        simpleAlert.accept();  // handling simple alert.
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(1000);
        Alert confirmAlert = driver.switchTo().alert();
        String AlertText = confirmAlert.getText();
        System.out.println(AlertText);
        confirmAlert.dismiss();
        WebElement promptAlertButton = driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(1000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Wahab is trying");
        promptAlert.accept();
        driver.quit();

    }
}
