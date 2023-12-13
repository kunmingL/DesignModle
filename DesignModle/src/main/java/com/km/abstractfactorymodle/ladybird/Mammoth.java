package com.km.abstractfactorymodle.ladybird;

import com.km.abstractfactorymodle.HighClassUnit;

import java.text.MessageFormat;

public class Mammoth extends HighClassUnit {
    public Mammoth(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("虫族猛犸出现坐标，X{0},Y{1}",x,y));
    }

    @Override
    public void attack() {
        System.out.println("猛犸攻击，攻击力："+attack);
    }
}
