package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin.javascript.navig.Link;

import java.util.List;

public class GetAllLinksOnEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links"+ allLinks.size());

        for(WebElement link:allLinks){
            String LinkText = link.getText();
           String fullLink = link.getAttribute("href");
            if(!LinkText.isEmpty()){
                System.out.println(LinkText+"    "+fullLink);
            }
        }
    }
}
