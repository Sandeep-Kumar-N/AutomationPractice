package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",
        glue = {"stepDefinition"},
        dryRun = false,
        monochrome = true,
        strict = true
        )


public class TestRunner {
}
