package com.km.strategymodle.chatgpt;

/**
 * 最后，我们定义一个环境类 DiscountContext，用于持有具体的策略类，
 * 并提供一个方法 calculateDiscountPrice，用于计算折扣价格
 */
public class DiscountContext {
    private DiscountStrategy discountStrategy;

    public DiscountContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscountPrice(double price) {
        return price - discountStrategy.calculateDiscount(price);
    }
}
