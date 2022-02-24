package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-html-report/cucumber-html-report.html"},
        tags = "@Login")


public class runner {
}
