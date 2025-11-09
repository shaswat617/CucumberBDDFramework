package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class WatchingMovieSteps {
    @Given("User has valid login credentials of NetFlix")
    public void userHasValidLoginCredentialsOfNetFlix() {
        System.out.println("Step 1 : Valid credentials of NetFlix");
    }

    @When("User adds comedy movies to WatchList")
    public void userAddsComedyMoviesToWatchList(DataTable dataTable) {
        List<List<String>> movieList = dataTable.asLists(String.class);
        for (List<String> moviesName :  movieList)
        {
            System.out.println("Movie Name : " + moviesName.get(1));
        }
    }

    @And("User has NetFlix Subscription")
    public void userHasNetFlixSubscription() {
        System.out.println("Step 2 : User has NetFlix Subscription");
    }


    @Then("User should be able to see Comedy in WatchList")
    public void userShouldBeAbleToSeeComedyInWatchList() {
        System.out.println("Step 4 : Comedy movies added to WatchList");
    }

    @When("User adds patriotic movies to Watchlist")
    public void userAddsPatrioticMoviesToWatchlist(DataTable dataTable) {
        System.out.println("Step 5 : Add Patriotic movies to Watchlist");
    }

    @Then("User should be able to see Patriotic Movies in WatchList")
    public void userShouldBeAbleToSeePatrioticMoviesInWatchList() {
        System.out.println("Step 6 : Patriotic movies added to WatchList");
    }
}
