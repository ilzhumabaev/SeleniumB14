package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
    WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
    searchBox.sendKeys("laptops");
        WebElement searchButton = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        searchButton.click();
        List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        for (WebElement each:list){
            if (each.getText().equals("Newest HP 14\" HD Laptop, Windows 11, Intel Celeron Dual-Core Processor Up to 2.60GHz, 4GB RAM, 64GB SSD, Webcam, Dale Pink(Renewed) (Dale Pink)")){
                each.click();
            }

        }



    }
}
