package com.harish.stepdefs;

import io.cucumber.java.*;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
public class CucumberSteps {

    @Value("${rest.api.host}")
    private String serverBaseUrl;

    @BeforeStep
    public void beforeStep(){
        log.info("Step def: before step");
    }

    @AfterStep
    public void afterStep(){
        log.info("Step def: after step");
    }

    @Before
    public void beforeScenario(final Scenario scenario){
        log.info("Step def: before Scenario:" + scenario.getName());
        RestAssured.baseURI = serverBaseUrl;
        //Below line is used to print request and response
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @After
    public void afterScenario(Scenario scenario){
        log.info("Step def: after Scenario:id:" + scenario.getId());
        final String result = scenario.isFailed() ? "fail" : "pass";
        log.info("Step def: after scenario:result : " + result);
    }
}
