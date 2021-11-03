package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
       //Task#2---------------------------------------------------------------------------------------------------------
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.facebook.com";
        driver.get(url);
        WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        newAccount.click();
        Thread.sleep(1000);
        WebElement firstN = driver.findElement(By.name("firstname"));
        firstN.sendKeys("Zaid");
        WebElement LastN = driver.findElement(By.name("lastname"));
        LastN.sendKeys("Amr");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("wahab@syntax.com");
        WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("wahab@syntax.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("SyntaxStudent");
        WebElement monthDD = driver.findElement(By.id("month"));
        Select selectM = new Select(monthDD);
        List<WebElement> month = selectM.getOptions();
        selectM.selectByValue("3");
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectd = new Select(dayDD);
        List<WebElement> day = selectd.getOptions();
        selectd.selectByIndex(5);
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selecty = new Select(yearDD);
        List<WebElement> year = selecty.getOptions();
        selecty.selectByValue("2000");
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        Thread.sleep(1000);
        WebElement signup = driver.findElement(By.name("websubmit"));
        signup.click();
        Thread.sleep(1000);
        driver.quit();

    }
}
