package com.km.abstractfactorymodle.ladybird;

import com.km.abstractfactorymodle.MidClassUnit;

import java.text.MessageFormat;

public class Poison extends MidClassUnit {

    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("虫族毒液出现坐标，X{0},Y{1}",x,y));
    }

    @Override
    public void attack() {
        System.out.println("毒液攻击，攻击力："+attack);
    }
}
