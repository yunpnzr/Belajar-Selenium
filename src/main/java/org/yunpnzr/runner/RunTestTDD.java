package org.yunpnzr.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "org.yunpnzr.stepDef",
        tags = "@TDD",
        plugin = {"pretty", "html:target/cucumber-report-tdd.html"}
)
public class RunTestTDD {

}
