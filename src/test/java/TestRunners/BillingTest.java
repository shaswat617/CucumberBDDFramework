package TestRunners;

import io.cucumber.java.es.Cuando;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/AppFeatures/billing_outline.feature",
            glue = "StepDefinitions",
            plugin = {"pretty"}
    )
    public class BillingTest {

    }
