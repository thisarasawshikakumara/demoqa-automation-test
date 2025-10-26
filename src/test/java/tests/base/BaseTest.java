package tests.base;

import com.demoqa.enums.Environment;
import com.demoqa.util.ConfigReader;
import com.demoqa.util.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.getDriver();
        Environment env = Environment.valueOf(ConfigReader.get("env"));
        String url = ConfigReader.get(env.name()+"_URL");
        driver.get(url);
    }

    @AfterMethod
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
