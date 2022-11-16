package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class youTube {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("Justin Bieber");
        Thread.sleep(2000);
        WebElement click = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        click.click();
        Thread.sleep(2000);

        List<WebElement> justin = driver.findElements(By.cssSelector("#video-title"));
        for (WebElement each:justin){
if (each.getText().equals("Justin Bieber - Ghost")) {
    each.click();
}
            System.out.println(each.getText());
        }




    }
}
