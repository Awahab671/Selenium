package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
       //Task#3---------------------------------------------------------------------------------------------------------D

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.ebay.com";
        driver.get(url);
        WebElement allCategories = driver.findElement(By.id("gh-cat"));
        Select select = new Select(allCategories);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            String optionText = option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("58058");
        WebElement search = driver.findElement(By.id("gh-btn"));
        search.click();
        WebElement headerT = driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        String header = headerT.getText();
        if(header.equalsIgnoreCase("Computers, Tablets & Network Hardware")){
            System.out.println("The header is correct");
        }else{
            System.out.println(headerT);
        }
        driver.quit();
    }
}
