Feature: Login Test Feature
  In Order to perform successful Login
  As a Admin
  I should verify different scenarios for login

  Background: User is on login page

  @regression @smoke @sanity
  Scenario: Verify user should login successFully
    When I Enter username "Admin"
    And I Enter password "admin123"
    And I click on login button
    Then I Verify "Dashboard" Message

  @smoke @regression
  Scenario: Verify that the logo display on HomePage
    When I Enter username "Admin"
    And I Enter password "admin123"
    And I click on login button
    And I Login to Application
    Then I Verify Logo is Displayed

  @regression
  Scenario: Verify user should logOut successFully
    When I Enter username "Admin"
    And I Enter password "admin123"
    And I click on login button
    And I Click on User Profile logo
    And I Mouse hover on logout and click
    Then I Verify the text "Login Panel" is displayed

  @regression
  Scenario Outline: Verify error message with Invalid Credentials
    When I Enter username "<username>"
    And I Enter password "<password>"
    And I click on login button
    Then I Verify Error message "<errorMessage>"

    Examples:
      | username          | password | errorMessage        |
      |                   |          | Required            |
      | test123@gmail.com |          | Required            |
      |                   | test123  | Required            |
      | test123@gmail.com | test123  | Invalid credentials |