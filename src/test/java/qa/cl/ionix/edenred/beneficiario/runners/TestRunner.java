package qa.cl.ionix.edenred.beneficiario.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = false,
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"co.com.example.dualautoandroidios.steps"},
        plugin = {"pretty", "html:target/cucumber", "html:target/cucumber-reports.html"},
        tags = "@",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class TestRunner {
}