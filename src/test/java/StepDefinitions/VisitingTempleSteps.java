package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisitingTempleSteps {
    @Given("User has already the essentials to offer pray to Shiva")
    public void userHasAlreadyTheEssentialsToOfferPrayToShiva() {
        System.out.println("Test Step 1");
    }

    @When("User goes to temple with essentials")
    public void userGoesToTempleWithEssentials() {
        System.out.println("Test Step 2");
    }

    @Then("User should be able to offer pray to Shiva")
    public void userShouldBeAbleToOfferPrayToShiva() {
        System.out.println("Test Step 3");
    }

    @Given("User go to the Temple without essentials")
    public void userGoToTheTempleWithoutEssentials() {
        System.out.println("Test Step 4");
    }

    @When("User has to buy those essentials from the Temple")
    public void userHasToBuyThoseEssentialsFromTheTemple() {
        System.out.println("Test Step 5");
    }

    @Then("User should be able to offer pray to Narayan")
    public void userShouldBeAbleToOfferPrayToNarayan() {
        System.out.println("Test Step 6");
    }
}
