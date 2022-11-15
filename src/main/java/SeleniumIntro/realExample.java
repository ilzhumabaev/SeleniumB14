package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class realExample {
    public static void main(String[] args) {

        //  Test Case - Open Godaddy.com and validate it's Page title and the url.
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//4. Get Title of page and validate it.(if conditions) expected title
//4. Get URL of current page and validate it.          expected url
//            5. Close browser.(driver.close)

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // this is the example of polymorphism. We are creating chromedriver from Webdriver
        driver.manage().window().maximize();
        driver.get("https://www.godaddy.com/");
        String actualTitle = driver.getTitle().trim();// it suggested using .trim() at the end
        String expectedTitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title test passed");
        }else {
            System.out.println("Title test failed");
        }
driver.get("https://www.godaddy.com/");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.godaddy.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("URL test is passed");
        }else {
            System.out.println("URL test is failed");
        }
driver.close();
    }
}
