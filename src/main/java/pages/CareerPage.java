package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CareerPage {
    WebDriver driver;
    WebDriverWait wait;

    By career = By.xpath("//a[@href='/career/']");
    By lifeatTF = By.xpath("//a[@href='#people']");

    By twoIntern = By.xpath("//span[text()='Life of two interns']");

    By jobOpening = By.xpath("//a[@href='#job']");

    By textString = By.xpath("//div[@class='h4']/span");
    public CareerPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void careerClick(){
        wait.until(ExpectedConditions.elementToBeClickable(career)).click();
    }

    public void lifeatTenForceClick(){
        wait.until(ExpectedConditions.elementToBeClickable(lifeatTF)).click();
    }

    public void twoInternClick(){

        WebElement element = driver.findElement(twoIntern);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void naviagteBack(){
        driver.navigate().back();
    }

    public void jobOpening(){
        wait.until(ExpectedConditions.elementToBeClickable(jobOpening)).click();
    }

    public String getValue(){
        String text = driver.findElement(textString).getText();
        return text;
    }

}


/*
Go on Career page
3. Go on Life at Tenforce session///
4. Open “Life of two interns” article and open it//
5. Scroll through the article
6. Go back to Job openings and make sure there is the text “Feel free to send your
CV to job”
 */