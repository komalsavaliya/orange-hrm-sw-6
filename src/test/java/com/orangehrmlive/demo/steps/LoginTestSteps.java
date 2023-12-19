package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTestSteps {
    @When("I Enter username {string}")
    public void iEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("I Enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I Verify {string} Message")
    public void iVerifyMessage(String dashboard) {
        Assert.assertEquals(new DashboardPage().verifyDashboardText(),
                dashboard, "Incorrect message displayed!");
    }

    @Then("I Verify Logo is Displayed")
    public void iVerifyLogoIsDisplayed() {
        new HomePage().verifyOrangeHrmLogo();
    }

    @And("I Click on User Profile logo")
    public void iClickOnUserProfileLogo() {
        new HomePage().clickOnUserProfileLogo();
    }

    @And("I Mouse hover on logout and click")
    public void iMouseHoverOnLogoutAndClick() {
        new LoginPage().mouseHoverAndClickOnLogout();
    }

    @Then("I Verify the text {string} is displayed")
    public void iVerifyTheTextIsDisplayed(String loginPanelDisplayed) {
        Assert.assertEquals(new LoginPage().getTextForLoginPanel(),
           loginPanelDisplayed, "Incorrect message displayed!");
    }

    @Then("I Verify Error message {string}")
    public void iVerifyErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),
             errorMessage, "Message Displayed");
    }
}

