package tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        //1.Open chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.go to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3.Verify title equals:
        //expected:Web orders login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification passed");
        }else{
            System.out.println("Login page title verification failed");
        }
        //4.enter username:tester
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");
        //5.enter password:test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("Test");
        //6.click "Sign In" button - verify title equals:
        WebElement loginButton =  driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
        //expected: Web Orders
        String expectedLoginTitle = "Web Orders";
        String actualLoginTitle = driver.getTitle();

        if(expectedLoginTitle.equals(actualLoginTitle)){
            System.out.println("Home page title verification passed");
        }else{
            System.out.println("Home page title verification failed");
        }
    }
}
