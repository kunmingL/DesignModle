package com.km.singlemodle;

public class Sun {
    private static final Sun SUN = new Sun();
    //构造方法私有化
   private Sun(){

    }

    //阳光普照，方法公开化
    public static Sun getInstance(){
       return SUN;
    }
}
