package com.quintin.calculator;

public abstract class Operation {
    Double numberA;
    Double numberB;
    
    abstract public Double getResult() throws Exception;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }
}
