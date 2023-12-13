package com.km.strategymodle.chatgpt;

/**
 * 打折策略类
 */
public class DiscountStrategyByRate extends DiscountStrategy {
    private double rate;

    public DiscountStrategyByRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateDiscount(double price) {
        return price * rate;
    }
}
