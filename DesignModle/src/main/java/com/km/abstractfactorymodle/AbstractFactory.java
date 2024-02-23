package com.km.abstractfactorymodle;

/**
 * 抽象工厂
 * 是将 一类 东西的生产 交给一个工厂，这样就不至于每一种东西都交给工厂实现
 * 重点也是怎么分这个类
 * 比如按照示例：可以分为人类和虫类
 *
 * 其实也可以分为低等兵种、中级、高级
 *
 *总结来说，简单工厂模式适用于创建单一类型的对象，简单易懂；
 * 而抽象工厂模式适用于创建一组相关的产品对象，更加灵活和可扩展。
 * 选择使用哪种模式，需要根据具体的业务需求和设计要求来决定。
 *
 */
public interface AbstractFactory {
    LowClassUnit createLowClass();

    MidClassUnit createMidClass();

    HighClassUnit createHighClass();
}
