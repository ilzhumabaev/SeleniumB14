package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locators2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// waiting for website to be loaded before executing the test
        driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/ilias/Downloads/Techtorialhtml.html");
        // Locator: LinkText

        WebElement java = driver.findElement(By.linkText("Java"));
        java.click();
        WebElement javaHeader = driver.findElement(By.tagName("h1"));
        System.out.println(javaHeader.getText());
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement selenium = driver.findElement(By.linkText("Selenium"));
        selenium.click();
        WebElement headerSelenium = driver.findElement(By.tagName("h1"));
        System.out.println(headerSelenium.getText());
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement cucumber = driver.findElement(By.linkText("Cucumber"));
        cucumber.click();
        WebElement headerCucumber = driver.findElement(By.tagName("h1"));
        System.out.println(headerCucumber.getText());
        driver.navigate().back();
        WebElement testNg = driver.findElement(By.linkText("TestNG"));
        testNg.click();
        WebElement HeaderTestNg = driver.findElement(By.tagName("h2"));
        System.out.println(HeaderTestNg.getText());
        driver.navigate().back();
        // driver.close();
        // LOCATOR: PartialLinkText // only works if there is an "a tag"
        WebElement restApi = driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        System.out.println(driver.getTitle());

        System.out.println("UPDATE");
        System.out.println("update1");
        String s = "dg";
        String s1 = "sf";




    }
}
