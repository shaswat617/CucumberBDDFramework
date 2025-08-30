package TestRunners;

import io.cucumber.java.es.Cuando;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberBDDFramework/src/test/resources/AppFeatures/uber.feature",
        glue = "StepDefinitions",
        plugin = {"pretty"}
)

public class UberTest {
}
