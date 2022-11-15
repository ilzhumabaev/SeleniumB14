package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class practice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/deals?ref_=nav_cs_td_bfc_dt_cr");
        //twotabsearchtextbox
        WebElement header = driver.findElement(By.id("twotabsearchtextbox"));
        header.sendKeys("black friday deals 2022");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement earlyBlackFriday = driver.findElement(By.linkText("Early Black Friday Deals"));
        earlyBlackFriday.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,500)");
        WebElement departments = driver.findElement(By.className("GridFilters-module__gridFilterSection_36xNFAVppWfx4i4otzVc2Y"));







    }
}
