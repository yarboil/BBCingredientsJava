package com.bbcingredients;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources",
        plugin = {"pretty", "html:/Users/Yarboi/JavaProjects/peppertaponline/BBCingredients/src/test/java/com/bbcingredients/reports/reports.html", "junit:target/reports/junit_report.xml"},
        snippets = SnippetType.CAMELCASE,
        tags = "@run"
)
public class RunCucumberTests {

}
