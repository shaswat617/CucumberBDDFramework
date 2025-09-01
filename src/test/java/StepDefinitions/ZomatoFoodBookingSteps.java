package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ZomatoFoodBookingSteps {

    @Given("User has launched the zomato application on the device")
    public void userHasLaunchedTheZomatoApplicationOnTheDevice() {
        System.out.println("Background : Given");
    }

    @And("User is already logged in into this app")
    public void userIsAlreadyLoggedInIntoThisApp() {
        System.out.println("Background : Given And");
    }

    @When("User enters username")
    public void userEntersUsername() {
        System.out.println("Background : When");
    }

    @And("User enters password")
    public void userEntersPassword() {
        System.out.println("Background : When And");
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        System.out.println("Background : When And And");
    }

    @Then("User is redirected to the home page of the app")
    public void userIsRedirectedToTheHomePageOfTheApp() {
        System.out.println("Background : Then");
    }

    @Given("User has selected an item already")
    public void userHasSelectedAnItemAlready() {
        System.out.println("Scenario 1 : Given");
    }

    @When("User keeps more items to the list")
    public void userKeepsMoreItemsToTheList() {
        System.out.println("Scenario 1 : When");
    }

    @Then("User should be able to add all the items properly")
    public void userShouldBeAbleToAddAllTheItemsProperly() {
        System.out.println("Scenario 1 : Then");
    }

    @Given("User has added some items in the list")
    public void userHasAddedSomeItemsInTheList() {
        System.out.println("Scenario 2 : Given");
    }

    @When("User deselects some items from zomato app")
    public void userDeselectsSomeItemsFromZomatoApp() {
        System.out.println("Scenario 2 : When");
    }

    @Then("User should not be able to see those deselected items from the list anymore")
    public void userShouldNotBeAbleToSeeThoseDeselectedItemsFromTheListAnymore() {
        System.out.println("Scenario 2 : Then");
    }
}
