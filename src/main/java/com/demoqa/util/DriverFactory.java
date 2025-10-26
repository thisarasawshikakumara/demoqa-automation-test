package com.demoqa.util;

import com.demoqa.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            String browserName = ConfigReader.get("browser");
            BrowserType browserType = BrowserType.valueOf(browserName);

            switch (browserType){
                case CHROME ->{
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case FIREFOX ->{
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
            }

            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver !=null) {
            driver.quit();
            driver = null;
        }
    }
}
