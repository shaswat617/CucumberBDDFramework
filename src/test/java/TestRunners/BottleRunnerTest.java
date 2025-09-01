package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberBDDFramework/src/test/resources/AppFeatures/bottle_fill.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"},
        tags = "@Regression and @JIRA-233"

)
public class BottleRunnerTest {

}
