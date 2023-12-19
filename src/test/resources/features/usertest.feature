Feature: User Test Feature
  As a user,
  I should be able to add user successfully
  I should be able to verify the added user successfully
  I should able to delete the add user successfully
  I should be able to search for the user and it should be unique user

  Background: User is on LoginPage
    When I Enter username "Admin"
    And I Enter password "admin123"
    And I click on login button

  @regression @smoke @sanity
  Scenario: Admin Should Add User SuccessFully
    When I Login to Application
    And I click On "Admin" Tab
    Then I Verify "System Users" Text
    And I click On "Add" button
    Then I Verify "Add User" Text
    And I Select User Role "Admin"
    And I enter Employee Name "Goutam Ganesh"
    And I enter Username "MaulinPatel"
    And I Select status "Disable"
    And I enter password "Mary321"
    And I enter Confirm Password "Mary321"
    And I click On save Button
    Then I verify message "Successfully Saved"

  @smoke @regression
  Scenario: Search The User Created And Verify It
    When I Login to Application
    And I click On "Admin" Tab
    Then I Verify "System Users" Text
    And I enter Username "MaulinPatel"
    And I Select User Role "Admin"
    And I Select status "Disable"
    And I Click on Search Button
    Then I should able to see the user name "MaulinPatel" in result list

  @regression
  Scenario: Verify That Admin Should Delete The User SuccessFully
    When I Login to Application
    And I click On "Admin" Tab
    Then I Verify "System Users" Text
    And I enter Username "MaulinPatel"
    And I Select User Role "Admin"
    And I Select status "Disable"
    And I Click on Search Button
    Then I should able to see the user name "MaulinPatel" in result list
    And I Click on Check box
    And I Click on Delete Button
    Then I Popup will display and  I Click on Ok Button on Popup
    And I verify message "Successfully Deleted"

  @Sanity @Smoke @Regression
  Scenario Outline: Search The User And Verify The Message Record Found
    When I Login to Application
    And I click On "Admin" Tab
    Then I Verify "System Users" Text
    And I Enter Username "<username>"
    And I Select User Role "<userRole>"
    And I Enter EmployeeName "<employeeName>"
    And I Select Status "<status>"
    And I Click on Search Button
    And I verify message "(1) Record Found" message
    And I Verify username "<username>"
    Then I Click on Reset Tab

    Examples:
      | username     | userRole | employeeName  | Status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwin | Admin    | Odis Adalwin  | Enable |