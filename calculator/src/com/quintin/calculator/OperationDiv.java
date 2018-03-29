package com.quintin.calculator;

public class OperationDiv extends Operation {

    @Override
    public Double getResult() throws Exception {
        if (numberB == 0) {
            throw new Exception("被除数不能为0");
        }
        return numberA / numberB;
    }

}
