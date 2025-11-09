package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartBackgroundSteps {

    @Given("User is logged into Flipkart")
    public void userIsLoggedIntoFlipkart() {
        System.out.println("Background 1: User is logged into Flipkart");
    }


    @When("User is in Orders tab")
    public void userIsInOrdersTab() {
        System.out.println("Background 2: User is in Orders tab");
    }

    @When("user navigates to {string} order tab")
    public void userNavigatesToOrderTab(String orderType) {
        System.out.println("user navigates to "+orderType+" tab");
    }

    @Then("{string} order tab should be opened")
    public void orderTabShouldBeOpened(String orderType) {
        System.out.println(orderType+" order tab should be opened");
    }
}

