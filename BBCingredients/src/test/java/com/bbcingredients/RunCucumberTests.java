package com.bbcingredients;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources",
        plugin = {"pretty", "html:put"},
        snippets = SnippetType.CAMELCASE,
        tags = "@run-test"
)
public class RunCucumberTests {

}
