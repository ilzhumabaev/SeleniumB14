package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstName.sendKeys("Ilyas");
        WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        LastName.sendKeys("Jumaba");
        WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
        Email.sendKeys("1231111r@gmail.com");
        WebElement telephone = driver.findElement(By.cssSelector("#input-telephone"));
        telephone.sendKeys("649816198");
        WebElement password = driver.findElement(By.cssSelector("#input-password"));
        password.sendKeys("12345");
        WebElement confirmPassword = driver.findElement(By.cssSelector("#input-confirm"));
        confirmPassword.sendKeys("12345");
        WebElement privacyEnter = driver.findElement(By.tagName("b"));
        privacyEnter.click();
        WebElement text = driver.findElement(By.cssSelector(".modal-title"));
        String actualText = text.getText().trim();
        String expected = "Privacy Policy";
        if (actualText.equals(expected)){
            System.out.println("Correct");
        }else {
            System.out.println("Wrong");
        }

        WebElement close = driver.findElement(By.cssSelector(".close"));
        close.click();
        WebElement privacyButton = driver.findElement(By.xpath("//input[@name='agree']"));
        if (!privacyButton.isSelected()){
            privacyButton.click();
        }
        WebElement next = driver.findElement(By.xpath("//input[@type='submit']"));
        next.click();
        WebElement confirmationFinal = driver.findElement(By.xpath("//h1[.='Your Account Has Been Created!']"));
        String actual = confirmationFinal.getText();
        String expected2 = "Your Account Has Been Created!";
        if (actual.equals(expected2)){
            System.out.println(actual);
        }

         /*
1-Navigate to the website http://tutorialsninja.com/demo/index.php?route=account/register
2-Fill all the boxes
3-Click privacy button
4-Print out the text and close the tab
5-CLick privacy button if it is not selected
4-Click continue button
5-Validate Account is created header

NOTE:To be able get see account is created for you last run make sure you have a different email
just add ahmet1,ahmet2 like that everytime for validation.
}
     */
    }
}
