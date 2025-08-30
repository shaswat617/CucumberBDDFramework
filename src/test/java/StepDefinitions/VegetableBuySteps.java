package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VegetableBuySteps {
    @Given("^User is on the home page of \"([^\"]*)\"$")
    public void userIsOnTheHomePageOf(String siteName) {
        System.out.println("Step 1 : User is on the home page of "+ siteName);
    }

    @When("User selects only those vegetables which is of {string}")
    public void userSelectsOnlyThoseVegetablesWhichIsOf(String quality) {
        System.out.println("Step 2 : User is looking for only "+ quality + " vegetable");
    }

    @Then("^User will have to pay Rs. ([0-9])$")
    public void userWillHaveToPayRs(int price) {
        System.out.println("Step 3 : User pay Rs. "+  price);
    }
}
