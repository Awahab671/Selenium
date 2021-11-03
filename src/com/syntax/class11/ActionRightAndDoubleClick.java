package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightAndDoubleClick {
    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)version 94\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement rightClick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        WebElement editButton = driver.findElement(By.xpath("//span[text() = 'Edit']"));
//editButton.click();
        actions.click(editButton).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickButton).perform();
        String alertText = alert.getText();
        System.out.println("Alert text equals " + alertText);
        alert.accept();
    }
}
