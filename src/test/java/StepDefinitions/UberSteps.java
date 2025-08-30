package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {
    @Given("User wants to select a car of type {string}")
    public void userWantsToSelectACarOfType(String carType) {
        System.out.println("Step 1 : User wants to select a car of type "+ carType);
    }

    @When("User selects car type as {string} and pick up point as {string} and drop point as {string}")
    public void userSelectsCarTypeAsAndPickUpPointAsAndDropPointAs(String carType, String pick, String drop) {
        System.out.println("Step 2 : User selects car type as "+ carType + " "+
                " and pickup location as "+ pick + " and drop location as "+ drop);
    }

    @Then("Driver starts Journey")
    public void driverStartsJourney() {
        System.out.println("Step 3 : Driver starts journey");
    }

    @And("Driver ends journey")
    public void driverEndsJourney() {
        System.out.println("Step 4 : Driver ends journey");
    }

    @Then("User pays Rs. {int}")
    public void userPaysRs(Integer fare) {
        System.out.println("Step 5 : Users pays an amount of Rs. "+ fare);
    }

}
