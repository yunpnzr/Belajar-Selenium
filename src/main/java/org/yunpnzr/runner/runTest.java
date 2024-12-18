package org.yunpnzr.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.yunpnzr.stepDef",
        tags = "@Login",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class runTest {

}
