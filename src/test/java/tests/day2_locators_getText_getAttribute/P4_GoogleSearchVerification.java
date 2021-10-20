package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {
        //1.open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.go to:https://google.com
        driver.get("https://google.com");
        //3.Write "apple" in search box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        //4.Click google search button
        //5.Verify Title:
        //Expected:Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
