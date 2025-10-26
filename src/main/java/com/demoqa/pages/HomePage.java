package com.demoqa.pages;

import com.demoqa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(xpath = "//h5[text()='Elements']/../../..")
    private WebElement btnElements;

    @FindBy(xpath = "//h5[text()='Forms']/../../..")
    private WebElement btnForms;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public HomePage clickOnElementsButton(){
        click(btnElements);
        return this;
    }

    public HomePage clickOnFormsButton(){
        click(btnForms);
        return this;
    }
}
