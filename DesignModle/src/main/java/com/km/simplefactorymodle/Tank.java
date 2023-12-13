package com.km.simplefactorymodle;

import java.text.MessageFormat;

public class Tank extends Enemy {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("绘制坦克在上图层，坐标X{0},Y{1}",x,y));
    }
}
