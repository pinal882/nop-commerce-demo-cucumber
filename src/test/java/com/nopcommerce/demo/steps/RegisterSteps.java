package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new RegisterPage().clickOnRegisterLink();
    }

    @Then("I see register message")
    public void iSeeRegisterMessage() {
        Assert.assertEquals(new RegisterPage().getRegisterText(),"Register");
    }





    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGenderTab();
    }

    @And("I enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("pin");
    }

    @And("I enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("sh");
    }

    @And("I select day")
    public void iSelectDay() {
        new RegisterPage().selectDay();
    }

    @And("I select month")
    public void iSelectMonth() {
        new RegisterPage().selectMonth();
    }

    @And("I select Year")
    public void iSelectYear() {
        new RegisterPage().selectYear();
    }

    @And("I enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail("a2b4@gmail.com");

    }

    @And("I enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("abc123");
    }

    @And("I confirm password")
    public void iConfirmPassword() {
        new RegisterPage().confirmPassword("abc123");
    }

    @And("I click on {string} button")
    public void iClickOnButton(String registerButton) {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I see a message {string}")
    public void iSeeAMessage(String registerMessage) {
        new RegisterPage().verifyRegistrationCompletedMessage();
    }

    @And("I enters following users details")
    public void iEntersFollowingUsersDetails() {
    }

    @And("I see the error message First name is required.")
    public void iSeeTheErrorMessageFirstNameIsRequired() {
        String expectedText = "First name is required.";
        String actualText = new RegisterPage().verifyFirstNameErrorMessage();
        Assert.assertEquals(actualText,expectedText,"message not displayed");
    }

    @And("I see the error message Last name is required.")
    public void iSeeTheErrorMessageLastNameIsRequired() {
        String expectedText = "Last name is required.";
        String actualText = new RegisterPage().verifyLastNameErrorMessage();
        Assert.assertEquals(actualText,expectedText,"message not displayed");
    }

    @And("I see the error message Email is required.")
    public void iSeeTheErrorMessageEmailIsRequired() {
        String expectedText = "Email is required.";
        String actualText = new RegisterPage().verifyEmailErrorMessage();
        Assert.assertEquals(actualText,expectedText,"message not displayed");
    }

    @And("I see the error message Password is required.")
    public void iSeeTheErrorMessagePasswordIsRequired() {
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().verifyPasswordErrorMessage();
        Assert.assertEquals(actualText,expectedText,"message not displayed");
    }

    @And("I see the error message ConfirmPassword is required.")
    public void iSeeTheErrorMessageConfirmPasswordIsRequired() {
        String expectedText = "Password is required.";
        String actualText = new RegisterPage().verifyConfirmPasswordError();
        Assert.assertEquals(actualText,expectedText,"message not displayed");
    }

    @And("I click on register Button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }
}
