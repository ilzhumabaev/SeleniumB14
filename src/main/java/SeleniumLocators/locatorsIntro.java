package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locatorsIntro {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("file:///C:/Users/ilias/Downloads/Techtorialhtml.html");
        WebElement header = driver.findElement(By.id("techtorial1"));
        System.out.println(header.getText());
        String actualHeader = header.getText().trim();
        String expectedHeader = "Techtorial Academy";
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Your header passed");
        }else {
            System.out.println("Your header failed");
        }


        WebElement text = driver.findElement(By.id("details2"));
        String textActual = text.getText();
        System.out.println(textActual);


// LOCATOR NAME:

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Ilyas");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Juma");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("3239792566");
        WebElement email = driver.findElement(By.name("userName"));
        email.sendKeys("ilyass@gmail.com");

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("164");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Palatine");
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("IL");
        WebElement postalCode= driver.findElement(By.name("postalCode"));
       postalCode.sendKeys("60074");

       //LOCATOR: CLASS

        WebElement checkBoxes = driver.findElement(By.className("checkboxes"));
        System.out.println(checkBoxes.getText());



        WebElement javaBox = driver.findElement(By.id("cond1"));
        if (javaBox.isDisplayed()) {
            javaBox.click();
        }


       WebElement seleniumBox = driver.findElement(By.id("cond2"));
        System.out.println(seleniumBox.isDisplayed());//true
        System.out.println(seleniumBox.isSelected()); //true
        seleniumBox.click();
        System.out.println(seleniumBox.isSelected());//false



        //LOCATOR: TagName
        WebElement javaVersion= driver.findElement(By.tagName("u"));
        String actualVersion = javaVersion.getText().trim();
        String expectedVersion = "Use Java Version";

        if (actualVersion.equals(expectedVersion)){

            System.out.println("The version is correct");
        }else {
            System.out.println("The version is incorrect");
        }








    }



}
