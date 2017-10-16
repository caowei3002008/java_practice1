package com.wei.calculator;

class Calculator implements java.io.Serializable{
    private double result = 0.0;
    private double operandOne = 0.0;
    private double operandTwo = 0.0;
    private String Operation;

    public Calculator(){
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return Operation;
    }

    public void setOperation(String operation) {
        this.Operation = operation;
    }
    public void performOperation(){
        switch(getOperation()){
            case "+":
                this.result = getOperandOne() + getOperandTwo();
                break;
            case "-":
                this.result = getOperandOne() - getOperandTwo();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation symbol: " + getOperation());
        }


    }


}
