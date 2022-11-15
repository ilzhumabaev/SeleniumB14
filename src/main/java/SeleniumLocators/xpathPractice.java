package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpathPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        button.click();
        WebElement box = driver.findElement(By.xpath("//input[@name='username']"));
        box.sendKeys("John Doe");
        WebElement boxPassword = driver.findElement(By.xpath("//input[@name='password']"));
        boxPassword.sendKeys("ThisIsNotAPassword");
        WebElement logIn = driver.findElement(By.xpath("//button[@id='btn-login']"));
        logIn.click();
        WebElement choose = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        choose.sendKeys("Hongkong CURA Healthcare Center");
        WebElement Apply = driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
        if (Apply.isDisplayed()) {
            Apply.click();
        }

        WebElement Program = driver.findElement(By.xpath("//input[@id='radio_program_medicaid']"));
        Program.isSelected();
        WebElement Date = driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        Date.sendKeys("11/11/2011");
        WebElement Comment = driver.findElement(By.xpath("//textarea[@id='txt_comment']"));
        Comment.sendKeys("hello");
        WebElement Book = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        Book.click();
        WebElement confirmation = driver.findElement(By.xpath("//h2[contains(text(),'Appointment Confirmation')]"));
        System.out.println(confirmation.getText());
        WebElement facility = driver.findElement(By.xpath("//p[contains(text(),'Hongkong CURA Healthcare Center')]"));



    }
}
