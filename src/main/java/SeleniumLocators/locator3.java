package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locator3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// waiting for website to be loaded before executing the test
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement horizontal = driver.findElement(By.linkText("Horizontal Slider"));
        horizontal.click();
        WebElement header = driver.findElement(By.tagName("h3"));
        System.out.println(header.getText());
        WebElement paragraph = driver.findElement(By.tagName("h4"));
        System.out.println(paragraph.getText());
        WebElement ElSel = driver.findElement(By.linkText("Elemental Selenium"));
        ElSel.click();
        driver.quit();


    }
}
