package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserTestSteps {
    @When("I Login to Application")
    public void iLoginToApplication() {
    }

    @And("I click On {string} Tab")
    public void iClickOnTab(String arg0) {
        new HomePage().clickOnAdminLink();
    }

    @Then("I Verify {string} Text")
    public void iVerifyText(String systemUsers) {
        Assert.assertEquals(new ViewSystemUsersPage().verifySystemUsersText(),
                systemUsers, "Error Message");
    }

    @And("I click On {string} button")
    public void iClickOnButton(String arg0) {
        new AddUserPage().clickOnAddButton();
    }

    @And("I Select User Role {string}")
    public void iSelectUserRole(String errorMessage) {
        Assert.assertEquals(new AddUserPage().verifyAddUserText(),
                errorMessage, "Incorrect error message displayed!");
    }

    @And("I enter Employee Name {string}")
    public void iEnterEmployeeName(String employeeName) {
        new AddUserPage().addEmployeeName(employeeName);
        new AddUserPage().employeeName();
    }

    @And("I enter Username {string}")
    public void iEnterUsername(String userName) {
        new AddUserPage().enterUsername(userName);
    }

    @And("I Select status {string}")
    public void iSelectStatus(String arg0) {
        new AddUserPage().dropDownSelectStatus();
        new AddUserPage().statusDropdownOnAddUserPage();
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new AddUserPage().enterPassword(password);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new AddUserPage().enterPassword(confirmPassword);
    }

    @And("I click On save Button")
    public void iClickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("I verify message {string}")
    public void iVerifyMessage(String successfullySaved) {
        Assert.assertEquals(new AddUserPage().getTextForSuccessfullyMessageAfterSavedAddedUser(),
                successfullySaved, "User not saved successfully");
    }

    @And("I Click on Search Button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I should able to see the user name {string} in result list")
    public void iShouldAbleToSeeTheUserNameInResultList(String successfullySaved) {
        Assert.assertEquals(new AddUserPage().getTextForSuccessfullyMessageAfterSavedAddedUser(),
                successfullySaved, "User not saved successfully");
    }

    @And("I Click on Check box")
    public void iClickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBoxButton();
    }

    @And("I Click on Delete Button")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @Then("I Popup will display and  I Click on Ok Button on Popup")
    public void iPopupWillDisplayAndIClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }

    @And("I Enter Username {string}")
    public void iEnterUsernameUsername(String username) {
        new AddUserPage().enterUsername(username);
    }

    @And("I Select User Role {string}")
    public void iSelectUserRoleUserRole(String userRole) {
        new AddUserPage().mouseHoverOnUserRole();
        new AddUserPage().selectOnUserRoleDropDown();
    }

    @And("I Enter EmployeeName {string}")
    public void iEnterEmployeeNameEmployeeName(String employeeName) {
        new AddUserPage().addEmployeeName(employeeName);
        new AddUserPage().employeeName();
    }

    @And("I Select Status {string}")
    public void iSelectStatusStatus(String status) {
        new AddUserPage().dropDownSelectStatus();
        new AddUserPage().statusDropdownOnAddUserPage();
    }

    @And("I verify message {string} message")
    public void iVerifyMessageMessage(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(),
                message, "Incorrect message displayed!");
    }
    @And("I Verify username {string}")
    public void iVerifyUsernameUsername(String userName1) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(),
                userName1, "Incorrect username displayed!");
    }
    @Then("I Click on Reset Tab")
    public void iClickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}



