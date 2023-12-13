package com.km.strategymodle.usb;

public class Computer {
    private USB usb;
    public void setUsb(USB usb){
        this.usb = usb;
    }

    public void comput(){
        usb.read();
    }
}
