package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    By actual = By.xpath("//div[@class='h4']/span[text()='Feel free to send your CV to']");
    public CareerPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void careerClick(){
        wait.until(ExpectedConditions.elementToBeClickable(career)).click();
    }

    public void lifeatTenForceClick(){
        wait.until(ExpectedConditions.elementToBeClickable(lifeatTF)).click();
    }

    public void twoInternClick(){
        wait.until(ExpectedConditions.elementToBeClickable(twoIntern)).click();
    }

    public void naviagteBack(){
        driver.navigate().back();
    }

    public void jobOpening(){
        wait.until(ExpectedConditions.elementToBeClickable(jobOpening)).click();
    }

    public String getValue(){
        String text = driver.findElement(actual).getText();
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