package com.km.prototype;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 客户端
 * 常规创建多个实例
 *
 * Java中的变量分为原始类型和引用类型
 * 从类到对象叫作“创建”，而由本体对象至副本对象则叫作“克隆”，当需要创建多个类似的复杂对象时，我们就可以考虑用原型模式。
 *  原型模式的重点在于 在其类中实现Cloneable类中的 clone方法。但是类目前只能单实现。
 *
 */
public class Client1 {
//    public static void main(String[] args) {
//        List<EnemyPlane> enemyPlanes = new ArrayList<>();
//
//        for (int i=0;i<500;i++){
//            //此处于随机纵坐标处出现敌机
//            EnemyPlane enemyPlane = new EnemyPlane(new Random().nextInt(200));
//            enemyPlanes.add(enemyPlane);
//        }
//    }

    public static void main(String[] args) throws CloneNotSupportedException{
        List<EnEmyPlaneClone> enemyPlanes = new ArrayList<>();
        EnEmyPlaneClone enEmyPlaneClone = new EnEmyPlaneClone(500);
        Instant instantStart = Instant.now();
        for (int i = 0; i <500 ; i++) {
            EnEmyPlaneClone clone = enEmyPlaneClone.clone();
            clone.setX(new Random().nextInt());
            enemyPlanes.add(enEmyPlaneClone);
        }
        Instant instantEnd = Instant.now();
        System.out.println(Duration.between(instantStart,instantEnd).toMillis());

//        Instant instantStart1 = Instant.now();
//        //工厂
//        List<EnEmyPlaneClone> enemyPlanes1 = new ArrayList<>();
//        for (int i = 0; i < 500 ; i++) {
//            EnEmyPlaneClone instance = EnemyPlanFactory.getInstance(new Random().nextInt());
//            enemyPlanes1.add(instance);
//        }
//        Instant instantEnd2 = Instant.now();
//        System.out.println(Duration.between(instantStart1,instantEnd2).toMillis());
    }


}
