package com.km.strategymodle.calculator;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new Addition());
        System.out.println(calculator.getResult(1,1));

        calculator.setStrategy(new SubTraction());
        System.out.println(calculator.getResult(1,1));
    }
}
