package com.bbcingredients;

import com.bbcingredients.features.support.helper.util.BrowserStack;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/bbcingredients/features",
        plugin = {"pretty", "html:src/test/java/com/reports", "junit:src/test/java/com/reports/junit_report.xml"},
        snippets = SnippetType.CAMELCASE
)

public class RunCucumberTest{

}