package com.km.strategymodle.chatgpt;

/**
 * 现在，我们可以在客户端代码中使用策略模式来计算商品的折扣价格了：
 */
public class Client {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext(new DiscountStrategyByRate(0.8));
        double price = 100;
        double discountPrice = context.calculateDiscountPrice(price); // 打八折
        System.out.println(discountPrice);

        context.setDiscountStrategy(new DiscountStrategyByAmount(50, 10));
        discountPrice = context.calculateDiscountPrice(price); // 满50减10
        System.out.println(discountPrice);

        context.setDiscountStrategy(new DiscountStrategyByCashback(100, 20));
        discountPrice = context.calculateDiscountPrice(price); // 满100返20
        System.out.println(discountPrice);
    }
}
