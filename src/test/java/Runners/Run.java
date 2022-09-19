package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature.feature",
        glue = {"stepDefinitions"},
        tags="@TC2"
)
public class Run extends AbstractTestNGCucumberTests {
}
