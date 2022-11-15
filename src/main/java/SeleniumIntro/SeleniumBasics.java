package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        //We are setting up out automation
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        // window user should put .exe at the end

        WebDriver driver = new ChromeDriver();
        // this is the example of polymorphism. We are creating chromedriver from Webdriver
        driver.manage().window().maximize();// this maximizes your screen
        driver.get("http://www.techtorialacademy.com/");
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Home Page - Techtorial";
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Your test is passed");
        }else {
            System.out.println("Your test is failed");
        }


        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://www.techtoriaacademy.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Your URL test is passed");
        }else {
            System.out.println("Your URL test is failed");
        }

    }
}
