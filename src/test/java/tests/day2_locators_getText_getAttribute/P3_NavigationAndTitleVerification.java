package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        //1.open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        //2.go to https://google.com
        driver.get("https://google.com");
        //3.Click gmail from top right
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();
        //4.verify title contains
        //expected:gmail
        String expectedInTitle = "Gmail";
        String actualTitle=driver.getTitle();//Gmail-email from google

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        //ctrl+d multiples the current line
        //ctrl+ship+up/down arrow - change lines

        //5.go back google by using the .back();
        driver.navigate().back();
        //6.verify title equals
        //expected:google
        String expectedGoogleTitle="Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
