package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberBDDFramework/src/test/resources/AppFeatures/restaurant_table.feature",
        glue = {"StepDefinitions","hooks"},
        plugin = {"pretty"}
)
public class RestoTest {

}
