package tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //1.open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2.go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        //3.enter incorrect user name
       // driver.findElement(By.id("email")).sendKeys("something123@gmail.com");
        WebElement inputUsername= driver.findElement(By.id("email"));
        inputUsername.sendKeys("1213@gmail.com");
       //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("pass"));
        //4.enter incorrect password
        inputPassword.sendKeys("123zizi"+ Keys.ENTER);
        //5.verify title changed to:
        //expected "Log into Facebook"
        String expectedTitle = "Log into Facebook";
        System.out.println("expectedTitle = " + expectedTitle);
        //Freezing the code for 5 secs
        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
