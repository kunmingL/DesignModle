package com.km.abstractfactorymodle.ladybird;

import com.km.abstractfactorymodle.LowClassUnit;

import java.text.MessageFormat;

public class Roach extends LowClassUnit {
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("虫族蟑螂出现坐标，X{0},Y{1}",x,y));
    }

    @Override
    public void attack() {
        System.out.println("蟑螂攻击，攻击力："+attack);
    }
}
