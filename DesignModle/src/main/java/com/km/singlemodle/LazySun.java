package com.km.singlemodle;

/**
 * 单例的核心概念在于 对象只能在本身方法内创建
 * 始终只能内部创建，无法用于外部创建；
 * 外部始终只能获得创建好的对象，内部判断是否已经存在，若存在则返回内部创建对象，若不存在则内部创建。
 */
public class LazySun {
    //不进行初始化，而是有需要再调用获取实例
    private static  LazySun lazySun;

    private LazySun(){

    }

    public static synchronized LazySun getInstance(){
        if (lazySun == null){
            lazySun = new LazySun();
        }
        return lazySun;
    }

    /**
     *然而这样的做法是要付出一定代价的，试想，
     * 线程还没进入方法内部便不管三七二十一直接加锁排队，会造成线程阻塞，
     * 资源与时间被白白浪费。我们只是为了实例化一个单例对象而已，
     * 犯不上如此兴师动众，使用synchronized让所有请求排队等候。
     * 所以，要保证多线程并发下逻辑的正确性，同步锁一定要加得恰到好处，
     * 其位置是关键所在
     *
     * ****要理解 多线程与并发
     */
    public static  LazySun getInstance1(){
        if (lazySun == null){
            synchronized (Sun.class){
                if (lazySun == null){
                    lazySun = new LazySun();
                }
            }
        }
        return lazySun;
    }
}
