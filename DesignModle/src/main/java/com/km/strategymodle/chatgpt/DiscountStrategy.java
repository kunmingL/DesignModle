package com.km.strategymodle.chatgpt;

/**
 * 假设有一个电商网站，需要根据不同的促销策略来计算商品的折扣价格。
 * 其中，促销策略包括打折、满减、返现等。我们可以使用策略模式来实现这个功能。
 */
public abstract class DiscountStrategy {
    /**
     * 其中包含一个抽象方法 calculateDiscount，用于计算折扣价格
     * @param price
     * @return
     */
    public abstract double calculateDiscount(double price);
}
