package com.km.strategymodle.calculator;

public class SubTraction implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
