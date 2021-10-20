package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        //1.Open chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //LOCATE THE LINK AND STORE INSIDE OF WebElement
        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        //3.Verify link text from top left:
        //Expected ZeroBank
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();
        //driver.findElement(By.className("brand")).getText();
        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification passed");
        }else{
            System.out.println("Link text verification failed");
        }
        //4.Verify link href attribute value contains:
        //expected: index.html
        String expectedAttributeValue = "index.html";

       // String actualHrefValue = driver.findElement(By.className("brand")).getAttribute("href");
        String actualHrefValue = zeroBankLink.getAttribute("href");
        System.out.println("actualHrefValue = "+actualHrefValue);

        if(actualHrefValue.contains(expectedAttributeValue)){
            System.out.println("HREF attribute value verification passed");
        }else{
            System.out.println("HREF attribute value verification failed");
        }
    }
}
