package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(xpath = "//h5[text()='Elements']/../../..")
    private WebElement btnElements;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public HomePage clickOnElement(){
        click(btnElements);
        return this;
    }
}
