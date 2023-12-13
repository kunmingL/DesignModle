package com.km.prototype;

public class EnemyPlane {
    //敌机横坐标
    private int x;
    //敌机纵坐标
    private int y =0;

    public EnemyPlane(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //让敌机飞
    public void fly(){
        y++;
    }
}
