package com.km.strategymodle.chatgpt;

/**
 * 返现策略类
 */
public class DiscountStrategyByCashback  extends DiscountStrategy {
    private double threshold;
    private double cashback;

    public DiscountStrategyByCashback(double threshold, double cashback) {
        this.threshold = threshold;
        this.cashback = cashback;
    }

    @Override
    public double calculateDiscount(double price) {
        if (price >= threshold) {
            return cashback;
        }
        return 0;
    }

}
