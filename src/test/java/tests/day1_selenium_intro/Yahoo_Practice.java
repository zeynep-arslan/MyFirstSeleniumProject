package tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {

        //yahoo title verification
        //setup browser driver
        WebDriverManager.chromedriver().setup();
        //open chrome browser
        //this line opens EMPTY BROWSER
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //go to https://www.yahoo.com
        driver.get("https://yahoo.com");
        //verify title
        //expected:yahoo
        //this value always come from documentation
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title
        //this value come from the browser
       String actualTitle =  driver.getTitle();
        System.out.println(actualTitle);
       //creating our verification
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected.Verification PASSED!");
        }else{
            System.out.println("Title is not as expected.Verification FAILED!");
        }

        //closing the browser
        driver.close();


    }
}
