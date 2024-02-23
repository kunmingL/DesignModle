package com.km.prototype;

public class EnEmyPlaneClone implements Cloneable {
    //敌机横坐标
    private int x;
    //敌机纵坐标
    private int y =0;

    public EnEmyPlaneClone(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }

    //让敌机飞
    public void fly(){
        y++;
    }

    public EnEmyPlaneClone clone() throws CloneNotSupportedException{
        return (EnEmyPlaneClone)super.clone();
    }



}
