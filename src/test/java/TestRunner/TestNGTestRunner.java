package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/Features/HomePage.feature", "src/test/resources/Features/RemoveItem.feature"},
        glue = "StepDefinitions",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html", "html:target/htmlReports.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
