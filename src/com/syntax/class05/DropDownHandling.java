package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class DropDownHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement daysDD = driver.findElement(By.id("select-demo"));
        Select select = new Select(daysDD);
        /*select.selectByIndex(3);
        Thread.sleep(1000);

        select.selectByVisibleText("Thursday");
        Thread.sleep(1000);

        select.selectByValue("Sunday");
        Thread.sleep(1000);*/
        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        System.out.println(size);

        for(int i=0; i<size; i++){
            String optionText= allOptions.get(i).getText();
            System.out.println(optionText);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }

        }

    }

