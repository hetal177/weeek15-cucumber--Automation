package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.SignINPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInStep {
    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^user click on signIn button$")
    public void userClickOnSignInButton() {
        new SignINPage().clickonSignInButton();
    }

    @Then("^user is able to navigate to signinpage successfully$")
    public void userIsAbleToNavigateToSigninpageSuccessfully() {
        String expectedTest = "Create an account";
        String actualTest = new SignINPage().getVerifyCreateAnAccount();
        Assert.assertEquals("User is not on signIn page", expectedTest, actualTest);
    }

    @And("^user click on signIn btn$")
    public void userClickOnSignInBtn() {
    }

    @Then("^user should get \"([^\"]*)\"$")
    public void userShouldGet(String message) throws Throwable {
       new SignINPage().getVerifyAuthenticationFailedMessage();
    }

    @When("^user enter \"([^\"]*)\"$")
    public void userEnter(String username ) throws Throwable {
       new SignINPage().enterUesrname(username);
    }

    @And("^user enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password) throws Throwable {
       new SignINPage().enterPassword(password);
    }
}

