package com.km.strategymodle.chatgpt;

/**
 * 满减策略类
 */
public class DiscountStrategyByAmount extends DiscountStrategy {
    private double threshold;
    private double amount;

    public DiscountStrategyByAmount(double threshold, double amount) {
        this.threshold = threshold;
        this.amount = amount;
    }

    @Override
    public double calculateDiscount(double price) {
        if (price >= threshold) {
            return amount;
        }
        return 0;
    }
}
