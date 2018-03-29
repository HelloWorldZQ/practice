package com.quintin.calculator;

public class OperationFactory {
    public static Operation getOperation(String operatorStr) {
        switch (operatorStr) {
        case "+":
            return new OperationAdd();
        case "-":
            return new OperationSub();
        case "*":
            return new OperationMul();
        case "/":
            return new OperationDiv();
        default:
            return null;
        }
    }
}
