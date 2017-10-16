package com.wei.calculator;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperandOne(10);
        c1.setOperandTwo(20);
        c1.setOperation("-");
        c1.performOperation();
        System.out.println(c1.getResult());
    }
}
