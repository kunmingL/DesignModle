package com.km.simplefactorymodle;

public abstract class Enemy {

    protected int x;

    protected int y;

    public Enemy(int x,int y){
        this.x = x;
        this.y = y;
    }

    //抽象方法，在地图绘制
    public abstract void show();
}
