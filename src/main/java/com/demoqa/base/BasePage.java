package com.demoqa.base;

import com.demoqa.util.ConfigReader;
import com.demoqa.util.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    private final WebDriverWait wait;

    public BasePage() {
        this.driver = DriverFactory.getDriver();

        int implicitWaitTime = Integer.parseInt(ConfigReader.get("IMPLICIT_WAIT"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitTime));

        int explicitWaitTime = Integer.parseInt(ConfigReader.get("EXPLICIT_WAIT"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(explicitWaitTime));
    }

    protected void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void sendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(text);
    }
}
