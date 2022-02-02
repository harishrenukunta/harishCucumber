package com.harish.stepdefs;

import com.harish.enums.Operation;
import com.harish.framework.ScenarioContext;
import com.harish.services.CalculatorService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import static org.assertj.core.api.Assertions.assertThat;

@RequiredArgsConstructor
public class CalculatorStepDefs  extends BaseStep{

    private final CalculatorService calculatorService;
    private final ScenarioContext sc;
    @Value("${remote.host}")
    private String remoteHost;
    private int result;

    @Given("^user has access to calculator$")
    public void givenUserHasAccess(){
        System.out.println("Step defs:User has access to calculator:" + remoteHost);
        sc.increment();
    }

    @When("{operation} {int} and {int}")
    public void addTwoNumber(final Operation operation, final Integer a, final Integer b){
        switch(operation){
            case ADD:
                result = calculatorService.add(a, b);
                break;
            case SUBSTRACT:
                result = calculatorService.substract(a, b);
                break;
            case MULTIPLY:
                result = calculatorService.multiply(a, b);
                break;
            case DIVIDE:
                result = calculatorService.divide(a, b);
                break;
            default:
                throw new RuntimeException(String.format("No support for operation '%s'. Please check", operation.getOp()));
        }
    }

    @Then("verify addition of two numbers in calculator is {int}")
    public void verifyCalculatorResult(final Integer expectedResult){
        assertThat(result)
                .as("Addition of two numbers should be same as expected")
                .isEqualTo(expectedResult.intValue());
    }

}
