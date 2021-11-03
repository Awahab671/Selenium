package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Task1 {
    public static String url ="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        //Task#1--------------------------------------------------------------------------------------------------------
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(url);
        WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        newAccount.click();
        Thread.sleep(1000);
        WebElement monthDD = driver.findElement(By.id("month"));
        Select selectM = new Select(monthDD);
        List<WebElement> month = selectM.getOptions();
        int sizeM = month.size();
        if(sizeM==12){
            System.out.println("monthDD has twelve months");
        }else{
            System.out.println(sizeM);
        }
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectd = new Select(dayDD);
        List<WebElement> day = selectd.getOptions();
        int daysize = day.size();
        if (daysize==31){
            System.out.println("DayDD has thirty one day.");
        }else{
            System.out.println(daysize);
        }
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selecty = new Select(yearDD);
        List<WebElement> year = selecty.getOptions();
        int yearsize = year.size();
        if(yearsize==115){
            System.out.println("YearDD has 115");
        }else{
            System.out.println(yearsize);
        }
        selectM.selectByValue("9");
        Thread.sleep(1000);
        selectd.selectByVisibleText("6");
        Thread.sleep(1000);
        selecty.selectByValue("1991");
        Thread.sleep(1000);
        driver.quit();











    }
}
