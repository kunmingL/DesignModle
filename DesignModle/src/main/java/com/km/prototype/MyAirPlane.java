package com.km.prototype;

/**
 * 单例
 */

public class MyAirPlane {
    private static MyAirPlane myAirPlane;

    private MyAirPlane(){

    }

    public MyAirPlane getInstance(){
        if (myAirPlane == null){
            myAirPlane = new MyAirPlane();
        }
        return myAirPlane;
    }
}
