package com.km.prototype;

public class Bullet implements Cloneable{
    public Bullet(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
