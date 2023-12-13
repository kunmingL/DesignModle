package com.km.abstractfactorymodle.human;

import com.km.abstractfactorymodle.MidClassUnit;

import java.text.MessageFormat;

public class Tank extends MidClassUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("人类坦克出现坐标，X{0},Y{1}",x,y));
    }

    @Override
    public void attack() {
        System.out.println("坦克攻击，攻击力："+attack);
    }
}
