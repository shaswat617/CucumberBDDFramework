package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberBDDFramework/src/test/resources/AppFeatures/visiting_temple.feature",
        glue = {"StepDefinitions","hooks"},
        plugin = {"pretty"},
        tags = "@Smoke or @Regression"
)
public class VisitingTempleTest {
}
