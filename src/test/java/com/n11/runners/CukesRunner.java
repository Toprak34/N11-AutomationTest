package com.n11.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports"},
        features = "src/test/resources/features/",
        glue = "com/n11/step_definitions",
        dryRun = false,
        publish = true,
        tags = "@n11"


)

public class CukesRunner {
}
