package com.km.strategymodle.usb;

public class Mouse implements USB {
    @Override
    public void read() {
        System.out.println("鼠标输入指令...");
    }
}
