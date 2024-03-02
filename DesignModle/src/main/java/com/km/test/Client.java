package com.km.test;

import com.km.test.dto.RouteFlg;
import com.km.test.dto.SignOrOpenNoticeDto;
import com.km.test.impl.BJBank;
import com.km.test.impl.ECJD003;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Client {
    public static void main(String[] args) {
        BJBank bjBank = new BJBank();
        ECJD003 ecjd003 = new ECJD003();
        SignOrOpenNoticeDto signOrOpenNoticeDto = new SignOrOpenNoticeDto();
        bjBank.setBaseTrans(ecjd003);
        bjBank.outTrans(signOrOpenNoticeDto);

        /**
         * 初步实现 方法的统一调用
         * 问题：如果交易增加，我需要自己不断的补充装配问题
         */

        /*OutTransFactory outTransFactory = new OutTransFactory();
        RouteFlg routeFlg = new RouteFlg();
        routeFlg.setOrgNo("北京");
        routeFlg.setTransCode("ECJD003");
        SignOrOpenNoticeDto signOrOpenNoticeDto = new SignOrOpenNoticeDto();
        outTransFactory.connectCbpp(routeFlg,signOrOpenNoticeDto);*/

    }

}
