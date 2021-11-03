package com.syntax.class02;
//Selenium Task#2-------------------------------------------------------------------------------------------------------
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement newAccount = driver.findElement(By.linkText("Create New Account"));
        newAccount.click();
        Thread.sleep(2000);
        WebElement fn = driver.findElement(By.name("firstname"));
        fn.sendKeys("Masoud");
        WebElement ln = driver.findElement(By.name("lastname"));
        ln.sendKeys("Popal");
        WebElement phoneN = driver.findElement(By.name("reg_email__"));
        phoneN.sendKeys("9253245670");
        WebElement pass = driver.findElement(By.id("password_step_input"));
        pass.sendKeys("MasoudPopal123");
        Thread.sleep(2000);
        WebElement signupB = driver.findElement(By.name("websubmit"));
        signupB.click();
        driver.close();
    }
}
