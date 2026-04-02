package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollAction {

    WebDriver driver;

    public static void scroll(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}

