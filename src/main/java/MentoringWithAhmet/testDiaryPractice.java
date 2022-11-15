package MentoringWithAhmet;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testDiaryPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
        WebElement headerTestPage = driver.findElement(By.xpath("//h1"));
        System.out.println(headerTestPage.getText());
        WebElement text = driver.findElement(By.xpath("//strong[contains(text(),'This page is a test page for users of Test diary to run Selenium Tests on.')]"));
        System.out.println(text.getText());
        WebElement seleniumBox = driver.findElement(By.cssSelector("#seleniumbox"));
        if (seleniumBox.isDisplayed()&&!seleniumBox.isSelected()){
            seleniumBox.click();
        }
        WebElement radioButton = driver.findElement(By.cssSelector("#java1"));
        radioButton.click();
        WebElement save = driver.findElement(By.cssSelector("#demo"));
        save.click();
        WebElement testDiary = driver.findElement(By.linkText("Test Diary"));
        testDiary.click();
        WebElement printHeader = driver.findElement(By.xpath("//h1"));
        System.out.println(printHeader.getText());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(1000);
        WebElement testDiarySeleniumLearning = driver.findElement(By.xpath("//a[contains(text(),'Test Diary Selenium Learning')]"));
        testDiarySeleniumLearning.click();
        WebElement headerS = driver.findElement(By.xpath("//h1"));
        System.out.println(headerS.getText());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(1000);
        WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));
        contact.click();
        WebElement name = driver.findElement(By.xpath("//input[@name='your-name']"));
        name.click();
        name.sendKeys("John Smith");
        WebElement email = driver.findElement(By.xpath("//input[@name='your-email']"));
        email.click();
        email.sendKeys("J@gmail.com");
        WebElement subject = driver.findElement(By.xpath("//input[@name='your-subject']"));
        subject.click();
        subject.sendKeys("hello");
        WebElement comment = driver.findElement(By.xpath("//textarea[@name='your-message']"));
        comment.click();
        comment.sendKeys("hello");
        WebElement save1 = driver.findElement(By.xpath("//input[@type='submit']"));
        save1.click();
        WebElement info = driver.findElement(By.xpath("//div[@style='display: block;']"));
        String expected = "Your message was sent successfully. Thanks.";
        String actual = info.getText();
        System.out.println(info.getText());
        if (expected.equals(actual)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


        /*
NOTE:You can use any locator you want(id,classname,xpath,tagname....)
TASK 1:
1-Navigate to the website http://www.testdiary.com/training/selenium/selenium-test-page/
2-print out selenium test page from website
3-print out the paragraph from the  page
4-Check the selenium box is displayed or not, if it is displayed and not selected then click
5-Click java radio button
6-Click Save
 */
            /*
TASK 2:HyperLink Task:
1-Click the Test Dairy link with linktext
2-print out the header,title and currentUrl of Test Dairy from opening page
3-Navigate back to main page
4-Click Test Diary Selenium learning with PartialLinkText
5-print out the header,title and currentUrl of Test Dairy from opening page
 */

        /*
TASK 3:Contact Form
1-Fill the all the boxes (yourname,youremail,subject and your message)
2-Click save button
3-Validate (IF CONDITION) message "Your message was sent successfully.Thanks."
 */
    }
}
