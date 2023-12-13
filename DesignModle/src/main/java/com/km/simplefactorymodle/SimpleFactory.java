package com.km.simplefactorymodle;

import java.util.Random;

/**
 * 工厂方法是将 对象实例化逻辑 封装给工厂类实现，关于参数 从关心实例化对象参数
 * 转变到对工厂的实例化参数
 *
 * 不同的工厂 实例不同 的 对象
 *
 * 就是为了在最后使用上，不用自己去new对象
 * 也不是每个都需要使用工厂，这个还是根据实际情况决定。
 *
 *
 */
public class SimpleFactory {
    private int screenWidth;

    private Random random;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    public Enemy create(String type){
        int x = random.nextInt(screenWidth);
        Enemy enemy = null;
        switch (type) {
            case "AirPlane":
                enemy = new AirPlane(x, 0);
                break;

            case "Tank":
                enemy = new Tank(x, 0);
                break;

        }
        return enemy;
    }
}
