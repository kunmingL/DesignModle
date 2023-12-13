package com.km.strategymodle.calculator;

public interface Strategy {
    /**
     * 计算方法
     * @param a 操作数
     * @param b 被操作数
     * @return
     */
    public int calculate(int a,int b);
}
