package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class ComputerSteps {
    @Given(": I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I Click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computer Tab");
    }

    @Then("I  see Computer text")
    public void iSeeComputerText() {
        new ComputerPage().verifyComputerText();
    }

    @And("I Click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }

    @Then("I see Desktops text")
    public void iSeeDesktopsText() {
        new DesktopsPage().verifyDesktopsText();
    }
    @And("I Click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }
    @And("I Select computer features")
    public void iSelectComputerFeatures(DataTable dataTable) {
        List<List<String>> productList = dataTable.asLists(String.class);
        for (List<String> product : productList) {
            System.out.println(product);
        }
    }

    @And("I Click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I see message The product has been added to your shopping cart")
    public void iSeeMessageTheProductHasBeenAddedToYourShoppingCart() {
        String expectedText = "The product has been added to your shopping cart";
        String actualText = new BuildYourOwnComputerPage().verifyAddToShoppingCartMessage();
        Assert.assertEquals(actualText,expectedText,"message does not match");
    }



}




