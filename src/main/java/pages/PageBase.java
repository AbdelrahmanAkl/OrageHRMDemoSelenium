package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    WebDriver driver;
    public static Duration WAIT = Duration.ofSeconds(100);

    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public void waitForElementVisibility(By locator){
        WebDriverWait wait;
        wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitForElementToBeClickable(By locator){
        WebDriverWait wait;
        wait = new WebDriverWait(driver,WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void clickOnElement(By locator){
        waitForElementVisibility(locator);
        waitForElementToBeClickable(locator);
        driver.findElement(locator).click();
    }
    public void fillElement(By locator,String value){
        waitForElementVisibility(locator);
        driver.findElement(locator).sendKeys(value);
    }
    public String getElementText(By locator){
        return driver.findElement(locator).getText();
    }
    public String getCurrentURL(By locator){
        return driver.getCurrentUrl();
    }

}
