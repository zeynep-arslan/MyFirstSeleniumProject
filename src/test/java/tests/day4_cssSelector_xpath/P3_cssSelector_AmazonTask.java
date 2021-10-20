package tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) {
        //1.open chrome browser
       // WebDriver driver= new ChromeDriver();
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.go to https://amazon.com
        driver.get("https://amazon.com");
        //3.enter search term(use cssSelector to locate search box)
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("wooden spoon"+ Keys.ENTER);
        //4.verify title contains search term
        String expectedTitle ="Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
