package com.harish.enums;

import java.util.Arrays;

public enum Operation {
    ADD("add"),
    SUBSTRACT("substract"),
    MULTIPLY("multiply"),
    DIVIDE("divide");

    private Operation(final String op){
        this.op = op;
    }
    private String op;

    public String getOp(){
        return op;
    }

    public static Operation getOperationByType(String opToCheck) {
        return Arrays.stream(Operation.values())
                     .filter(op -> op.getOp().equals(opToCheck))
                     .findFirst()
                     .orElse(null);
    }
}
