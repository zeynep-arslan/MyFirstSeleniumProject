package tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        //1.open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //3.locate all the WebElements on the page using XPATH and/or css location
        //a.home link
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        //b.forgot password header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
        //c.e-mail text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        //d.e-mail input box
        WebElement inputBox =driver.findElement(By.cssSelector("input[name='email']"));
        //e.retrieve password button
        WebElement passwordButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        //f.powered by cybertek school text
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //4. verify all WebElements are display
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("passwordButton.isDisplayed() = " + passwordButton.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());

    }
}
