package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/rocky/Documents/CucumberFramework/src/test/resources/AppFeatures/search.feature",
        glue = "StepDefinitions"
)

public class AmazonTest {

}
