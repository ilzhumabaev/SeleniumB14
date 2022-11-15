package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://kaktus.media/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Кактус – новости Кыргызстана и Бишкека";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");

        }

        driver.get("https://www.bbc.com/");
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "BBC - Homepage";
        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");

        }

        driver.get("https://www.amazon.com/");
        String actualTitle3 = driver.getTitle();
        String expectedTitle3 = "Amazon.com. Spend less. Smile more.";
        //Amazon.com. Spend less. Smile more.

        if (actualTitle3.equals(expectedTitle3)) {
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

        driver.get("https://kaktus.media/");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://kaktus.media/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

        driver.get("https://www.bbc.com/");
        String actualUrl2 = driver.getCurrentUrl();
        String expectedUrl2 = "https://www.bbc.com/";
        if (actualUrl2.equals(expectedUrl2)){
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed");
        }

        driver.get("https://www.amazon.com/");
        String actualUrl3 = driver.getCurrentUrl();
        String expectedUrl3 = "https://www.amazon.com/";

        if(actualUrl3.equals(expectedUrl3)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

driver.close();





    }

}
