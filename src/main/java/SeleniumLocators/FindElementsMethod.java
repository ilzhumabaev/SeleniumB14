package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElementsMethod {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drive.get("file:///C:/Users/ilias/Downloads/Techtorialhtml.html");
        List<WebElement> allBoxes = drive.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement each:allBoxes){
            if(each.isDisplayed()&&each.isEnabled()&&!each.isSelected()){
                Thread.sleep(1000);
                each.click();
            }
        }


    }
}
