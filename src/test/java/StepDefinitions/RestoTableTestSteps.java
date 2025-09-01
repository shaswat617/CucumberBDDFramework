package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RestoTableTestSteps {

    @Given("User is looking for a restaurant with {int} star rating")
    public void userIsLookingForARestaurantWithStarRating(int arg0) {
        System.out.println("PR 1: 5 star restaurants with ratings as 5");
    }


    @When("User clicks on filter and selects restaurants with rating as {int}")
    public void userClicksOnFilterAndSelectsRestaurantsWithRatingAs(int arg0) {
        System.out.println("TS 1: Select high rated restaurants in filters");
    }


    @Then("User should be able to see restaurants rated as {int} in results")
    public void userShouldBeAbleToSeeRestaurantsRatedAsInResults(int arg0) {
        System.out.println("Res 1: Get 5 starred and high rated restaurants in results");
    }


    @Given("User is looking for an {string} and {string} restaurant")
    public void userIsLookingForAnAndRestaurant(String arg0, String arg1) {
        System.out.println("PR 1: Looking for economical and rating as 4");
    }

    @When("User clicks on filter and selects restaurants with rating {int} and price tag as {string}")
    public void userClicksOnFilterAndSelectsRestaurantsWithRatingAndPriceTagAs(int arg0, String arg1) {
        System.out.println("TS 2: Applied rating as 4");
    }

    @Then("User should be able to see restaurants rated as {int} and is {string}")
    public void userShouldBeAbleToSeeRestaurantsRatedAsAndIs(int arg0, String arg1) {
        System.out.println("Res2: Get restaurants rated 4 and economical");
    }

}
