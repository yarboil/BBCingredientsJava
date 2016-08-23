package com.bbcingredients;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java",
        plugin = {"pretty", "html:src/test/java/com/bbcingredients/reports", "junit:java/com/reports/junit_report.xml"},
        snippets = SnippetType.CAMELCASE,
        tags = "@browser"
)
public class RunCucumberTest {
}
