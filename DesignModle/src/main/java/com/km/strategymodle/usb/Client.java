package com.km.strategymodle.usb;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setUsb(new KeyBoard());
        computer.comput();
        computer.setUsb(new Mouse());
        computer.comput();
        computer.setUsb(new Camera());
        computer.comput();
    }
}
