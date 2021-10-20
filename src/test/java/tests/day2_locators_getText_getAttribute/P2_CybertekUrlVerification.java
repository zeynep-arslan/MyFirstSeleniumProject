package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        //SETUP THE BROWSER DRIVER
        WebDriverManager.chromedriver().setup();
        //1.open chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize the page
        driver.manage().window().maximize();
        //2.go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");
        //3.verify url contains
           //expected:cybertekschool
           String expectedInUrl = "cybertekschool";
           String actualUrl = driver.getCurrentUrl();

           if(actualUrl.contains(expectedInUrl)){
               System.out.println("URL verification passed");
           }else {
               System.out.println("URL verification failed");
           }

        //4.verify title:
        //expected:practice
        String expectedTitle = "Practice";
           String actualTitle =driver.getTitle();

           if(actualTitle.equals(expectedTitle)){
               System.out.println("Title verification passed");
           }else{
               System.out.println("Title verification failed");
           }
    }
}
