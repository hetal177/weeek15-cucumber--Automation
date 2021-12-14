package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.SignINPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;

public class CreateAccountSteps {


    @Given("^user is on signInPage$")

    public void userIsOnSignInPage() {
        new SignINPage().clickonSignInButton();
        new CreateAccountPage().verifySignInPage();

    }

    @When("^user fill personal informatiom$")
    public void userFillPersonalInformatiom() {
        new CreateAccountPage().fillPersonalInformationForm("hetal","patel","abc1234");
    }

    @And("^user fill address details$")
    public void userFillAddressDetails() {
        new CreateAccountPage().fillYourAddressDetails("1 Nice Building","Chicago","Illinois","32345","United States","0123456789","main home");
    }

    @And("^user click on Register Button$")
    public void userClickOnRegisterButton() {
        new CreateAccountPage().clickonRegBtn();
        String expectedTest= "My account";
        String actualTest= new CreateAccountPage().verifyMyAccountText();
        new SoftAssert().assertEquals(expectedTest,actualTest);
        new SoftAssert().assertAll();
    }


}
