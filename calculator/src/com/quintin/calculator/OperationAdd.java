package com.quintin.calculator;

public class OperationAdd extends Operation {

    @Override
    public Double getResult() {
        return numberA + numberB;
    }

}
