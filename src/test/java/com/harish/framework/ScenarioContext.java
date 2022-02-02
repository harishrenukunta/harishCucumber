package com.harish.framework;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ScenarioContext {

    private int counter=0;

    public void increment(){
        counter++;
    }
}
