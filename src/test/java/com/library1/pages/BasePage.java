package com.library1.pages;

import com.library1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(className = "title")
    protected WebElement pageTitle;


    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getPageTitleText(){
        return pageTitle.getText();
    }





}
