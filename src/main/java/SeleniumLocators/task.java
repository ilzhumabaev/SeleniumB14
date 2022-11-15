package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drive.get("https://the-internet.herokuapp.com/");
        List<WebElement> common = drive.findElements(By.tagName("li"));
        for (WebElement each: common){
            System.out.println(each.getText());

        }

        //TASK 2
        int count = 0;
        System.out.println("====================================");
        for (WebElement one: common){

            if (one.getText().length()<12){

                count++;
                System.out.println(one.getText());

            }
        }System.out.println(count);

    }
}
