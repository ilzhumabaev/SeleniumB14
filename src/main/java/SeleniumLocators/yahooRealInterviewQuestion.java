package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class yahooRealInterviewQuestion {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.yahoo.com/?guccounter=1");
        WebElement news = driver.findElement(By.cssSelector("#root_2"));
        news.click();
        List<WebElement> header = driver.findElements(By.xpath("//h3"));
        for (WebElement each:header){
            System.out.println(each.getText());
        }



    }
}
