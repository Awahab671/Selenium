package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ImplicitWaitDemo1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement getNewUser = driver.findElement(By.id("save"));
        getNewUser.click();
        WebDriverWait wait = new WebDriverWait(driver,20 );
        //wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath("//p[contains(text(), 'First Name')]");
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));


    }
}