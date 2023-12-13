package com.km.prototype;

public class EnemyPlanFactory {
    //此处单例模式创造原型
    private static EnEmyPlaneClone pototype = new EnEmyPlaneClone(200);

    //获取敌机克隆实例
    public static EnEmyPlaneClone getInstance(int x) throws CloneNotSupportedException{
        EnEmyPlaneClone clone = pototype.clone();
        clone.setX(x);
        return clone;
    }

}
