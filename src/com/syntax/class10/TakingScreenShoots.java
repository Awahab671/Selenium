package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenShoots {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)version 94\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE); // The screenshot is taken on this step.

        try{
            FileUtils.copyFile(sourceFile, new File("screenshots/SmarBear/adminLogin.png"));
        } catch (IOException e){
            e.printStackTrace();
        }

          }
}
