package com.km.test.impl;

import com.km.test.BaseTrans;

public abstract class BranchBank {

    private BaseTrans baseTrans;

    public void setBaseTrans(BaseTrans baseTrans) {
        this.baseTrans = baseTrans;
    }

    /**
     * v是入参
     * @param v
     * @return
     */
    public abstract Object outTrans(Object v);
}
