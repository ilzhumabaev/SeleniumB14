package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.youtube.com/");// it has methods
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();// google
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
       // System.out.println(driver.getPageSource());//html structure of the page
        driver.close();
    }
}
