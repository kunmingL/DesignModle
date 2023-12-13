package com.km.strategymodle.calculator;

public class Addition implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
