package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");   // for windows add .exe
        WebDriver driver = new ChromeDriver();       // We are launching the chrome browser.
        driver.get("https://www.google.com");  // we use the name of object(driver) to navigate to websites from now on.
        String url= driver.getCurrentUrl();
        System.out.println(url);
       String title=  driver.getTitle();
       System.out.println(title);
       driver.quit();
    }
}
