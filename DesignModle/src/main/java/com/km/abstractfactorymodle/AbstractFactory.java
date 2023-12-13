package com.km.abstractfactorymodle;

/**
 * 抽象工厂
 * 是将 一类 东西的生产 交给一个工厂，这样就不至于每一种东西都交给工厂实现
 * 重点也是怎么分这个类
 * 比如按照示例：可以分为人类和虫类
 *
 * 其实也可以分为低等兵种、中级、高级
 */
public interface AbstractFactory {
    LowClassUnit createLowClass();

    MidClassUnit createMidClass();

    HighClassUnit createHighClass();
}
