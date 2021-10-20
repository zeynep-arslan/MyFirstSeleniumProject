package tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) {
        //1.open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //3.click on button1
        //locating using text of the button with xpath
        //WebElement button1= driver.findElement(By.xpath("button[.='Button 1']"));


        //locating using "onclick" attribute value with xpath locator
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        //4.verify text displayed is as expected
        //expected:clicked on button one
        String expectedText ="Clicked on button one!";
        String actualTest = resultText.getText();

        if(actualTest.equals(expectedText)){
            System.out.println("Result text verification passed");
        }
        System.out.println("Result text verification failed");
    }
}
