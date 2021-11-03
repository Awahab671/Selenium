package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* Task
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.

TC 1: Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text

HW 2
HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.*/
public class HomeWork {

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();





    }
}
