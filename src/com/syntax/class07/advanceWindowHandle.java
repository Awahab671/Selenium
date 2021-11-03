package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class advanceWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        String url = "https://syntaxprojects.com/window-popup-modal-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        String mainPageHandle = driver.getWindowHandle();
        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instagramButton.click();
        facebookButton.click();
        igAndFbButton.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        while (it.hasNext()){
            String handle = it.next();
            driver.getTitle();
            driver.switchTo().window(handle);
            System.out.println(handle);
        }



    }
}
