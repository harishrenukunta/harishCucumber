package com.harish.stepdefs;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {com.harish.Config.TestConfig.class})
//@ContextConfiguration(classes = {com.harish.Config.TestConfig.class}) - application.properties will not be accessible
//@ContextConfiguration(classes = com.harish.Config.TestConfig.class,
//        initializers = ConfigFileApplicationContextInitializer.class)//This one loads application.properties as well
public class BaseStep {
}
