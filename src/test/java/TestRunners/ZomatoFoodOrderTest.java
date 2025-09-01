package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberBDDFramework/src/test/resources/AppFeatures/zomato_food_booking.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"}

)
public class ZomatoFoodOrderTest {
}
