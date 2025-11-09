package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingWithOutlineSteps {

    public Double billing;
    public Double tax;


    @Given("User is on billing page")
    public void userIsOnBillingPage() {
        System.out.println("Step 1 : User is on billing page");
    }

    @When("User enters billing amount {string}")
    public void userEntersBillingAmount(String billingAmount) {
        System.out.println("Step 2 : user enters billing amount");
        this.billing = Double.parseDouble(billingAmount);
    }

    @And("user enters tax amount {string}")
    public void userEntersTaxAmount(String taxAmount) {
        System.out.println("Step 3: user enters tax amount");
        this.tax = Double.parseDouble(taxAmount);
    }

    @And("user clicks on calculate button")
    public void userClicksOnCalculateButton() {
        System.out.println("Step4: User clicks on calculate button");
    }

    @Then("it gives final amount {string}")
    public void itGivesFinalAmount(String finalAmount) {
        System.out.println("Step 5: It gives the final amount: ");
        if (Double.parseDouble(finalAmount) == this.billing + this.tax) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}
