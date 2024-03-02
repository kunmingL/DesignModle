package com.km.test.impl;

import com.km.test.BaseTrans;

/**
 * 相同接口的不同实现 怎么从Spring容器拿出来 并进行区分
 *
 * 不同场景 对 这个使用
 *
 * 同一家分行调用两个接口
 */
public class BJBank extends BranchBank {

    private BaseTrans baseTrans;


    public void setBaseTrans(BaseTrans baseTrans) {
        this.baseTrans = baseTrans;
    }

    public Object outTrans(Object v){
        System.out.println("北京分行调用开始");
        Object o = baseTrans.outTrans(v);
        System.out.println("北京分行调用结束");
        return o;
    }
}
