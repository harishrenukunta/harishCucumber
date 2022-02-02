package com.harish.Config;

import com.harish.framework.ScenarioContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages={"com.harish.services"})
public class TestConfig {

    @Bean
    @Scope("cucumber-glue")
    public ScenarioContext createScenarioContext(){
        return new ScenarioContext();
    }
}
