package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement AB = driver.findElement(By.linkText("A/B Testing"));
        AB.click();
        WebElement paragraph = driver.findElement(By.xpath("/html/body/div[2]/div/div/p"));
        System.out.println(paragraph.getText().trim());
        WebElement seleniumEl = driver.findElement(By.xpath("//a[contains(text(),'Elemental Selenium')]"));
        seleniumEl.click();



    }
}
