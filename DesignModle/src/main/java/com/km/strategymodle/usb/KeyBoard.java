package com.km.strategymodle.usb;

public class KeyBoard implements USB {

    @Override
    public void read() {
        System.out.println("键盘指令输入数据...");
    }
}
