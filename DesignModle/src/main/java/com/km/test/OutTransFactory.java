package com.km.test;

import com.km.test.dto.RouteFlg;
import com.km.test.dto.SignOrOpenNoticeDto;
import com.km.test.impl.BJBank;
import com.km.test.impl.BranchBank;
import com.km.test.impl.ECJD003;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class OutTransFactory<K,V> {

//    RouteFlg routeFlg;
//
//    private BranchBank branchBank;
//
//    private BaseTrans baseTrans;
//
//    Method method;

    public BranchBank createBranchBank(String orgNo) throws Exception{
        Class<?> aClass = null;
        if (orgNo == "北京分行"){
            //可修改为查询数据库 通过机构号 获取对应的类名
           aClass = Class.forName("com.km.test.impl.BJBank");
        }
        Constructor<?> constructor = aClass.getConstructor();
        BranchBank o = (BranchBank)constructor.newInstance();
        return o;
    }

//    public OutTransFactory(RouteFlg routeFlg,BaseTrans baseTrans) throws Exception{
//        /**
//         * 根据routeFlg
//         * 可以通过反射获得
//         * 判断获取哪个分行 哪个交易
//         */
//        Class<?> aClass = Class.forName("com.km.test.impl.BJBank");
//        Method setBaseTrans = aClass.getMethod("setBaseTrans", baseTrans.getClass());
//        setBaseTrans.invoke(baseTrans);
//    }

//    public Object connectCbpp(V param)
//    {
//        branchBank.setBaseTrans(baseTrans);
//        Object o = branchBank.outTrans(param);
//        return o;
//    }
//
//    public Object connectCbppReflect(V param) throws Exception
//    {
//
//        Object invoke = method.invoke(param);
//        return invoke;
//    }
}
