package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberBDDFramework/src/test/resources/AppFeatures/buy_flat.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"},
        tags = "@Regression or not @Sanity"
)
public class BuyFlatTest {

}
