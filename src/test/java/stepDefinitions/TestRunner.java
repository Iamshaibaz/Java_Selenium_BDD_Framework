package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",
    monochrome = true,
    tags = "@smoke",
    plugin = { "pretty", "html:target/HtmlReports/reports.html" }
   // plugin = { "pretty", "json:target/jsonReports/report.json" }
   // plugin = { "pretty", "junit:target/JunitReports/report.xml" }
)

public class TestRunner {
	
}
