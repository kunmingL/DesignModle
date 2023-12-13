package com.km.abstractfactorymodle.human;

import com.km.abstractfactorymodle.LowClassUnit;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.MessageFormat;

public class Marine extends LowClassUnit {
    public Marine(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("人类士兵出现坐标，X{0},Y{1}",x,y));
    }

    @Override
    public void attack() {
        System.out.println("士兵攻击，攻击力："+attack);
    }
}
