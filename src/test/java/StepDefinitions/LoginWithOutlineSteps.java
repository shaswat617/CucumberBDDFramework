package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class LoginWithOutlineSteps {
    @Given("user is an application landing page")
    public void user_is_an_application_landing_page() {
        System.out.println("user is an application landing page");
    }

    @When("user clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
        System.out.println("user clicks on Sign in button");
    }

    @Then("user is displayed login screen")
    public void user_is_displayed_login_screen() {
        System.out.println("user is displayed login screen");
    }

    @When("user enters {string} in username field")
    public void user_enters_in_username_field(String string) {
        System.out.println("user enters" + string + " in username field");
    }

    @When("user enters {string} in password field")
    public void user_enters_in_password_field(String string) {
        System.out.println("user enters " + string + " in password field");
    }

    @When("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        System.out.println("user clicks on sign in");
    }

    @Then("user is able to login successfully")
    public void user_is_able_to_login_successfully() {
        System.out.println("user is able to login successfully");
    }

    @Then("user is not able to login successfully")
    public void userIsNotAbleToLoginSuccessfully() {
//        int i=0;
//        System.out.println(9/i);
        System.out.println("user is not able to login successfully");
    }
}
