package TestRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AppFeatures/test_login.feature",
        glue = "StepDefinitions",
        plugin = {"pretty",
                "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml"}

//        publish = true
//        monochrome = true
)

public class LoginWithOutlineTest {
}
