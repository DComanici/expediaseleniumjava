package com.expedia.stepDefinitions;

import org.junit.Assert;
import com.expedia.pages.SignInPage;
import com.expedia.web.JavascriptUtils;
import com.expedia.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDef extends WebDriverUtils{
    SignInPage signInPage = new SignInPage();



    @Given("user clicks on Sign in")
    public void user_clicks_on_Sign_in() throws InterruptedException {
        signInPage.signInBtn.click();

        Thread.sleep(3000);
    }

    @Given("user clicks on Sign in button in a new window")

    public void user_clicks_on_Sign_in_button_in_a_new_window() throws InterruptedException {

        JavascriptUtils.clickByJS(signInPage.signInBtnNewWindow);

        Thread.sleep(18000);

    }

    @When("user enters email {string}")
    public void user_enters_email(String email) throws InterruptedException {
        signInPage.emailBtn.sendKeys(email);
        Thread.sleep(2000);

    }

    @When("user enters password  {string}")
    public void user_enters_password(String password) throws InterruptedException {
        signInPage.passwordBtn.sendKeys(password);

        Thread.sleep(2000);

    }

    @When("user clicks Sign in")
    public void user_clicks_Sign_in() throws InterruptedException {
        signInPage.signInFinalBtn.click();

        Thread.sleep(25000);

    }

    @Then("user is logged in")
    public void user_is_logged_in() throws InterruptedException {
        boolean userIsLoggedIn = signInPage.staysBtn.isDisplayed();
        Assert.assertTrue(userIsLoggedIn);
        Thread.sleep(2000);


        
    }
    @Then("user is shown an error")
    public void user_is_shown_an_error() throws InterruptedException {
        boolean userIsShownAnError = signInPage.emailAndPasswordDontMatch.isDisplayed();
        Assert.assertTrue(userIsShownAnError);
        Thread.sleep(2000);
    }


}
