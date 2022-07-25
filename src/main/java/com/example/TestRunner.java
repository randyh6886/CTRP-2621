package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Create org and add person to trial
@CucumberOptions(
        plugin={"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features={"src/test/resources/features/browseToURL.feature","src/test/resources/features/orgTrials.feature"},
        glue={"com.example.Steps"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
}
