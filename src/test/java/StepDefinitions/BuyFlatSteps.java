package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyFlatSteps {
    @Given("User is on {string} landing page")
    public void userIsOnLandingPage(String siteName) {
        System.out.println("Step 1: User is on "+ siteName+ " landing page");
    }

    @And("User has chosen {string} location")
    public void userHasChosenLocation(String location) {
        System.out.println("Step 2 : User is searching flats for " + location + " location");
    }

    @When("User applies range as Rs. {int}")
    public void userAppliesRangeAsRs(int housePrice) {
        System.out.println("Step 3 : User is searching for flats within this range : Rs." + housePrice);
    }

    @Then("User should get proper results")
    public void userShouldGetProperResults() {
        System.out.println("Step 4 : User should get proper results in the results page");
    }
}
