package tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        //1.Open chrome browser
        WebDriverManager.chromedriver().setup();
        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();
        //maximize browser
        driver.manage().window().maximize();
        //2.go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //3.verify title
        //expected: "Facebook-Login or sign up"
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

    }
}
