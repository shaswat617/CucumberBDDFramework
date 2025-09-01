package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BottleFillSteps {
    @Given("User has a bottle of {string} brand")
    public void userHasABottleOfBrand(String arg0) {
        System.out.println("Scenario 1 - Given");
    }

    @When("User starts pouring the water inside the bottle of capacity {int} litres")
    public void userStartsPouringTheWaterInsideTheBottleOfCapacityLitres(int arg0) {
        System.out.println("Scenario 1 - When");
    }

    @Then("User should be able to fill {int} litres of water inside bottle")
    public void userShouldBeAbleToFillLitresOfWaterInsideBottle(int arg0) {
        System.out.println("Scenario 1 - Then");
    }

    @When("User starts emptying the bottle of capacity {int} litres")
    public void userStartsEmptyingTheBottleOfCapacityLitres(int arg0) {
        System.out.println("Scenario 2 - When");
    }

    @Then("User should be able to empty water from the bottle")
    public void userShouldBeAbleToEmptyWaterFromTheBottle() {
        System.out.println("Scenario 3 - Then");
    }
}
