Feature: Register feature

  @regression
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    Then I see register message

  @regression
  Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    Given I am on homepage
    When I click on register link
    And I click on register Button
    And I see the error message First name is required.
    And I see the error message Last name is required.
    And I see the error message Email is required.
    And I see the error message Password is required.
    And I see the error message ConfirmPassword is required.
  @regression
  Scenario: verifyThatUserShouldCreateAccountSuccessfully
    Given I am on homepage
    When I click on register link
    And I select gender "Female"
    And I enter firstname
    And I enter lastname
    And I select day
    And I select month
    And I select Year
    And I enter email
    And I enter password
    And I confirm password
    And I click on "REGISTER" button
    Then I see a message "Your registration completed"
    And I enters following users details
      |First Name  | LastName |     Email       | Password | ConfirmPassword|
      |abc         | xy       | a2b4c@gmail.com |   abc123 |     abc123     |