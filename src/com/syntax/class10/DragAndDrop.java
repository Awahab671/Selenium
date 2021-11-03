package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static String url = "https://jqueryui.com/droppable/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32 (1)version 94\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        //actions.dragAndDrop(draggable, droppable).perform();
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
    }
}
