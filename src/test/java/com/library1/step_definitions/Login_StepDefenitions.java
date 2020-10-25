package com.library1.step_definitions;

import com.library1.pages.LibraryPage;
import com.library1.pages.LoginPage;
import com.library1.utilities.BrowserUtilities;
import com.library1.utilities.ConfigurationReader;
import com.library1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefenitions {

    LoginPage loginPage = new LoginPage();
    LibraryPage libraryPage = new LibraryPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }

    @When("I login as {string}")
    public void i_login_as(String string) {
       loginPage.login(string);
    }

    @Then("I should see {string} page")
    public void i_should_see_page(String string) {
        String expectedTitle = string;
        BrowserUtilities.wait(2);
        String actualTitle = libraryPage.getPageTitleText();
        Assert.assertEquals(expectedTitle,actualTitle);


    }



}
