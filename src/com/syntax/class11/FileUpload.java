package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)version 94\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\pc\\Desktop\\xlsx\\Screenshoot#1.png");
       // WebElement uploadButton = driver.findElement(By.id("file-submit"));
        //uploadButton.click();

    }
}
