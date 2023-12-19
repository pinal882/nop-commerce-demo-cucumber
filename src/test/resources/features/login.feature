Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
  @regression
  Scenario: verifyTheErrorMessageWithInValidCredentials.
    Given I am on homepage
    When I click on login link
    And I enter email "abc@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I see the error message
  @regression
 Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
   Given I am on homepage
   When I click on login link
   And I enter email "a2b4@gmail.com"
   And I enter password "abc123"
   And I click on login button
   Then I see Logout link is displayed
  @regression
   Scenario: VerifyThatUserShouldLogOutSuccessFully
     Given I am on homepage
     When I click on login link
     And I enter email "abc@gmail.com"
     And I enter password "abc123"
     And I click on login button
     And I click on LogOut Link
   Then I see LogIn Link Display
