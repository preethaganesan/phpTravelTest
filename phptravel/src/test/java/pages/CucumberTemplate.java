package pages;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/phpFeatures",glue = {"stepDefs"},
monochrome = true,
plugin = { "pretty", "html:target/cucumber-reports/report.html" }
)



public class CucumberTemplate {

}
