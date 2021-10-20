package tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        //1.open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //3.Verify "Create a page" link  href value text:
       WebElement createPageLink=  driver.findElement(By.linkText("Create a Page"));
        //expected:"registration_form"
        String expectedInHref = "registration_form";
       String actualInHrefValue = createPageLink.getAttribute("href");

        System.out.println("actualInHrefValue = " + actualInHrefValue);

        if(actualInHrefValue.contains(expectedInHref)){
            System.out.println("HREF value verification passed");
        }else{
            System.out.println("HREF value verification failed");
        }
    }
}
