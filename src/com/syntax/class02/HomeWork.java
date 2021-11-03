package com.syntax.class02;
// Selenium Task#1------------------------------------------------------------------------------------------------------
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
       WebElement fName = driver.findElement(By.name("customer.firstName"));
       fName.sendKeys("Abdul");
        WebElement lName = driver.findElement(By.name("customer.lastName"));
        lName.sendKeys("Wahab");
        WebElement address = driver.findElement(By.id("customer.address.street"));
        address.sendKeys("123 sunny Avenue");
        WebElement city = driver.findElement(By.name("customer.address.city"));
        city.sendKeys("Concord");
        WebElement state = driver.findElement(By.name("customer.address.state"));
        state.sendKeys("CA");
        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys(("12345"));
        WebElement phoneNum = driver.findElement(By.id("customer.phoneNumber"));
        phoneNum.sendKeys(("987654321"));
        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys(("987654321"));
        WebElement userName = driver.findElement(By.id("customer.username"));
        userName.sendKeys(("abdulwahab"));
        WebElement password = driver.findElement(By.name("customer.password"));
        password.sendKeys(("Wahab"));
        WebElement confirm = driver.findElement(By.id("repeatedPassword"));
        confirm.sendKeys(("Wahab"));
        WebElement register = driver.findElement(By.className("button"));
        Thread.sleep(3000);
        register.click();
        driver.close();
    }
}
