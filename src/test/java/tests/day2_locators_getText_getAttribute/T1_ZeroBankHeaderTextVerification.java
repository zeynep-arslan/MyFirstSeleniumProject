package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        //1.open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        //2.go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3.verify header text
        //4.expected: log in to zero bank
        String expectedHeader = "Log in to ZeroBank";
        //1-locate the web element
        //2-get the text of it using getText() method
        WebElement actualHeader = driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();
        //String actualHeader = driver.findElement(By.tagName("h3")).getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header verification failed");
        }






    }
}
