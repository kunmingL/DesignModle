package com.km.singlemodle;

/**
 * todo 需要研究同步锁机制 代码块加锁与方法加锁的区别
 *
 */
public class BestSun {
    private volatile static BestSun sun;

    private BestSun() {
    }//构造方法私有化

    public static BestSun getInstance() {//华山入口
        if (sun == null) {//观日台入口
            synchronized (Sun.class) { //观日者进行排队
                if (sun == null) {
                    sun = new BestSun();//只有排头兵造了太阳，旭日东升
                }
            }
        }
        return sun; //ll……阳光普照，其余人不必再造日
    }
}