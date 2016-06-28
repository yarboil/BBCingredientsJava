package com.bbcingredients;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java",
        plugin = {"pretty", "html:target/cucumber", "junit:target/reports/junit_report.xml"},
        snippets = SnippetType.CAMELCASE,
        tags = "@wip"
)
public class RunCucumberTest {
}
