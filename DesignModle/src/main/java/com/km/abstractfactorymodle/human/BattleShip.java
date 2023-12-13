package com.km.abstractfactorymodle.human;

import com.km.abstractfactorymodle.HighClassUnit;

import java.text.MessageFormat;

public class BattleShip extends HighClassUnit {
    public BattleShip(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("人类战舰出现坐标，X{0},Y{1}",x,y));
    }

    @Override
    public void attack() {
        System.out.println("战舰攻击，攻击力："+attack);
    }
}
