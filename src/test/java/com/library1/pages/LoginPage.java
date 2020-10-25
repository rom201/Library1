package com.library1.pages;

import com.library1.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id = "inputEmail")
    private WebElement emailAddress; // works as user name

    @FindBy(id = "inputPassword")
    private WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    private WebElement signInButton;



    public void login (String role) {
        String email = "";
        String pass = "";
        if (role.equalsIgnoreCase("librarian")) {
            // librarian credentials
            email = ConfigurationReader.getProperty("emailLibrarian");
            pass = ConfigurationReader.getProperty("passwordLibrarian");
        } else {
            // student credentials
            email = ConfigurationReader.getProperty("emailStudent");
            pass = ConfigurationReader.getProperty("passwordStudent");
        }
        emailAddress.sendKeys(email);
        password.sendKeys(pass);
        signInButton.click();

    }







}



