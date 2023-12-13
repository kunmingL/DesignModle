package com.km.simplefactorymodle;

import sun.plugin2.message.Message;

import java.text.MessageFormat;

public class AirPlane extends Enemy {
    public AirPlane(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("绘制飞机在上图层，坐标X{0},Y{1}",x,y));
    }
}
