package com.automationpractice.cucumber.steps;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.WomenCategoryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.asserts.SoftAssert;

public class WomanCategorySteps {
    @When("^user click on women's link$")
    public void userClickOnWomenSLink() {
        new HomePage().setClickOnWomenLink();
    }

    @Then("^user should be navigated to Women's  page$")
    public void userShouldBeNavigatedToWomenSPage() throws InterruptedException {
        new HomePage().setClickOnWomenLink();
        Thread.sleep(5000);
        String expectedText = "WOMEN";
        String actualText = new WomenCategoryPage().verifyWomenText();
        new SoftAssert().assertEquals(actualText, expectedText);
        new SoftAssert().assertAll();
    }
}
