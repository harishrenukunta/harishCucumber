package com.harish.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//features="src/test/resources/features/",
@CucumberOptions(features="classpath:features",
            glue="com.harish.stepdefs",
            plugin = {"pretty", "json:target/cucumberReports/json/cucumber.json", "html:target/cucumberReports/html/index.html"})
public class CucumberRunner {
}
