package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1.Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go to http://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");
        //3.Click "Home" button

        Thread.sleep(3000);

         driver.findElement(By.className("nav-link")).click();
        //4.Verify title as expected:
        //Expected:Practice
          String expectedValue="Practice";
          String actualValue = driver.getTitle();
          if(expectedValue.equals(actualValue)){
              System.out.println("Title verification passed");
          }else{
              System.out.println("Title verification failed");
          }

    }
}
