package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static void main(String[] args) {
        // We are using Explicit wait in this example.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxprojects.com/dynamic-elements-loading.php";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement start = driver.findElement(By.id("startButton"));
        start.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome')]")));// here we are using explicit wait.

        WebElement welcome = driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(welcome.getText());

        driver.quit();



    }
}
