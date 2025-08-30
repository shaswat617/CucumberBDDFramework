package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightBook {


    @Given("User has launched the flight booking page of {string}")
    public void userHasLaunchedTheFlightBookingPageOf(String flightName) {
        System.out.println("Step 1 : Flight book page launched and the flight chosen is : " + flightName);
    }

    @When("User selects the origin as {string} and destination as {string}")
    public void userSelectsTheOriginAsAndDestinationAs(String origin, String destination) {
        System.out.println("Step 2 : Flight booking is under progress where the origin is "
        + origin + " and the destination is "+ destination);
    }

    @Then("User should be able to pay Rs. {int}")
    public void userShouldBeAbleToPayRs(int fairPrice) {
        System.out.println("User will pay Rs. "+fairPrice);
    }
}
