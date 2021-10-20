package tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_Search_Title_Verification {
    public static void main(String[] args) {
        //1.open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.go to https://etsy.com
        driver.get("https://etsy.com");
        //3.search wooden spoon
        //First we need to locate search bard
        //second we enter search value
        //third- we press enter
        driver.findElement(By.id("global-enhancements-search-query"))
                .sendKeys("wooden spoon"+ Keys.ENTER);
        //4.verify title
        //expected:"Wooden spoon | etsy"
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification title passed");
        }else {
            System.out.println("Verification title failed");
        }
    }
}
